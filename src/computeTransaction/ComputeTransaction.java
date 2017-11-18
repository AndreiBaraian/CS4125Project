package computeTransaction;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import account.Account;
import bll.RegionBLL;
import control.Control;
import region.Region;
import service.Service;
import service.ServiceFactory;

public class ComputeTransaction {

	//----------------------------------------------------------have the take the services from the data base and process all of them one by one
	
	private Control control=Control.getInstance();
	private static final String FILENAME = "generatedServices.csv";
	private RegionBLL regionBLL;
	
	public ComputeTransaction() {
		this.regionBLL = new RegionBLL();
	}
	
	public void computeBill(Service s){
		String number= s.getNumber();
		//---------------------------------------------------------- find the account based on number
		Account userAccount = null;
		double roamingTax= userAccount.getHomeregion().getRoamingTax();
		s.applyPrice(roamingTax);
		
	}
	
	public void processServices(){
		try (BufferedReader br = new BufferedReader(new FileReader(FILENAME))){
			String line;
			String csvSplitBy = ",";
			while((line = br.readLine()) != null){
				String[] serviceArg = line.split(csvSplitBy);
				Service service = ServiceFactory.getService(serviceArg[0], regionBLL.search(serviceArg[1]), serviceArg[2], regionBLL.search(serviceArg[4]), Integer.parseInt(serviceArg[5]));
				System.out.println(service.toString());
			}
		}catch(IOException e){
			e.printStackTrace();
		}
	}
}
