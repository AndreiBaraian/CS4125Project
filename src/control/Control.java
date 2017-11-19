package control;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

import bll.EnterpriseAccountBLL;
import bll.FamilyAccountBLL;
import account.EnterpriseAccount;
import account.FamilyAccount;
import region.Region;
import region.Romania;
import service.Service;
import service.ServiceFactory;

public class Control {
	private static final Control controlInstance= new Control();
	private List<Service> services;
	private List<Region> availableRegions;
	private List<String> types;
	private List<String> registeredNumbers;
	
	Random rand;
	String outputFile = "generatedServices.txt";
	BufferedWriter writer;
	
	private Control() {
		types = new ArrayList<String>(Arrays.asList("Message", "Call", "Internet"));
		
		availableRegions = new ArrayList<Region>();
		registeredNumbers =new ArrayList<String>();
		services= new ArrayList<Service>();
		Region romania= new Romania(0,0);
		
		//numi= "1112121";
		availableRegions.add(romania);
		//registeredNumbers.add(numi);
		rand = new Random();
	}
	
	public static Control getInstance(){
		return controlInstance;
	}
	
	public Region search(String name){
		for (Region r:availableRegions){
			if(r.getRegionName().equals(name))
				return r;
		}
		System.out.println("Region not found");
		return null;
	}

	public int generateRandomNumber(int min,int max)
	{
        Random random = new Random();
        int s = random.nextInt(max)%(max-min+1) + min;
        return s;
	}
	
	public void generateServices(Configuration C) {
		String generatedType = new String();
		Region from=null;
		Region to= null;
		int duration;
		String number;
		int quantity = C.getQuantity();
		List<EnterpriseAccount> enterpriseAccount;
		EnterpriseAccountBLL enterpriseAccountBLL = new EnterpriseAccountBLL();
		enterpriseAccount = enterpriseAccountBLL.getAll();
		for(int i = 0;i< quantity;i++)
		{
			int s = generateRandomNumber(0,enterpriseAccount.size());
			registeredNumbers.add(enterpriseAccount.get(s).getNumber());
		}
		try {
			writer = new BufferedWriter(new FileWriter(outputFile));

		for (int i = 0; i < quantity; i++) {

			number= registeredNumbers.get(rand.nextInt(registeredNumbers.size()));
			if (C.getType().equals("Any")) {
				generatedType = types.get(rand.nextInt(types.size()));
			} 
			if (C.getType().equals("Any")==false)
				generatedType = C.getType();

			if (C.getFrom().equals("Any")) {
				from = availableRegions.get(rand.nextInt(availableRegions.size()));
			} 
			if (C.getFrom().equals("Any")==false)
				from = this.search(C.getFrom());
			if (C.getTo().equals("Any")) {
				to = availableRegions.get(rand.nextInt(availableRegions.size()));
			} 
			if (C.getTo().equals("Any")==false)
				to = this.search(C.getTo());
			duration = rand.nextInt((C.getMaxDuration() - C.getMinDuration()) + 1) + C.getMinDuration();
			Service S= ServiceFactory.getService(generatedType, from, number, to, duration);
			services.add(S);
			
			writer.write(S.toString());
			writer.write("\n");
			System.out.println(S.toString());
			
		}
		writer.close();
		}
		
		catch(IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public List<Region> getAvailableRegions() {
		return availableRegions;
	}

	public void setAvailableRegions(List<Region> availableRegions) {
		this.availableRegions = availableRegions;
	}

	public List<Service> getServices() {
		return services;
	}

	public void setServices(List<Service> services) {
		this.services = services;
		}
}