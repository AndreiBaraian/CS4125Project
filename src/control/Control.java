package control;
import ccc.Number;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

import region.Region;
import service.Service;
import service.ServiceFactory;

public class Control {
	private List<Service> services;
	public List<Service> getServices() {
		return services;
	}

	public void setServices(List<Service> services) {
		this.services = services;
	}

	private List<Region> availableRegions;
	private List<String> types;
	private List<Number> registeredNumbers;
	private Number numi;
	Random rand;

	public Control() {
		types = new ArrayList<String>(Arrays.asList("Message", "Call", "Internet"));
		
		availableRegions = new ArrayList<Region>();
		registeredNumbers =new ArrayList<Number>();
		services= new ArrayList<Service>();
		Region irlanda= new Region("Irlanda");
		Region eu= new Region("EU");
		Region usa = new Region ("USA");
		Region china = new Region ("China");
		numi= new Number("1112121");
		availableRegions.add(irlanda);
		availableRegions.add(eu);
		availableRegions.add(usa);
		availableRegions.add(china);
		registeredNumbers.add(numi);
		rand = new Random();
	}

	public void generateServices(Configuration C) {
		String generatedType = new String();
		Region from=new Region();
		Region to= new Region();
		int duration;
		Number number;
		int quantity = C.getQuantity();
		

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
				from = new Region(C.getFrom());
			if (C.getTo().equals("Any")) {
				to = availableRegions.get(rand.nextInt(availableRegions.size()));
			} 
			if (C.getTo().equals("Any")==false)
				to = new Region(C.getTo());
			duration = rand.nextInt((C.getMaxDuration() - C.getMinDuration()) + 1) + C.getMinDuration();
			Service S= ServiceFactory.getService(generatedType, from, number, to, duration);
			services.add(S);
			System.out.println("type:"+generatedType+" from "+ from.getName()+ " to "+to.getName()+ " number "+ number.getValue()+ " duration "+ duration);
			
		}
	}


}
