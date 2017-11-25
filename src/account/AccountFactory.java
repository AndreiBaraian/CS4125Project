package account;
/*
 * @author Lucian Epure
 */
import java.util.ArrayList;
import java.util.List;

import customer.Customer;
import region.Region;

public class AccountFactory {

	public static Account getAccount(String type, double balance,Region homeRegion, Customer customer, String number,String endDate){
		if("Family".equalsIgnoreCase(type)){
			List<String> numbers = new ArrayList<String>();
			numbers.add(number);
			return new FamilyAccount(balance,homeRegion,customer,numbers);
		}
		else if("Enterprise".equalsIgnoreCase(type)){
			return new EnterpriseAccount(balance,homeRegion,customer,endDate,number);
		}
		else
		return null;// do the basic account(class must not be abstract if so)
		
}
}
