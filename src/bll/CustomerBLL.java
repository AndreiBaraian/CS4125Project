package bll;

/*
 * @author Andrei Baraian
 */

import java.text.DecimalFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Comparator;
import java.util.List;

import customer.Customer;
import dao.CustomerDAO;
import exceptions.InsertException;

public class CustomerBLL {
	
	private CustomerDAO customerDAO;
	
	public CustomerBLL(){
		this.customerDAO = new CustomerDAO();
	}
	
	public Customer add(String firstName, String lastName, int age, String address, String email) throws InsertException{
		Customer customer = new Customer(firstName, lastName, age, address, email);
		customer.setSystemReference(getNextSystemReference(firstName, lastName));
		System.out.println(customer.getSystemReference());
		customerDAO.add(customer);
		// maybe set the new id to the object
		return customer;
	}
	
	private String getNextSystemReference(String firstName, String lastName){
		List<Customer> allCustomers = customerDAO.getAll();
		StringBuilder newSysReference = new StringBuilder();
		newSysReference.append("REF");
		newSysReference.append("-");
		newSysReference.append(firstName.substring(0, 1));
		newSysReference.append(lastName.substring(0, 1));
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy/MM/dd");
		newSysReference.append("-");
		newSysReference.append(LocalDateTime.now().format(formatter));
		newSysReference.append("-");
		if(allCustomers.size() == 0)
			newSysReference.append("00000000");
		else{
			Comparator<String> sysReferenceComparator = new Comparator<String>() {
				@Override
				public int compare(String ref1, String ref2) {
					Long refNo1 = Long.parseLong(ref1.substring(18));
					Long refNo2 = Long.parseLong(ref2.substring(18));
					return refNo1.compareTo(refNo2);
				}
			};
			String currentSysReference = allCustomers.parallelStream().map(c->c.getSystemReference()).max(sysReferenceComparator).get();
			Long currentNumber = Long.parseLong(currentSysReference.substring(18));
			currentNumber++;
			DecimalFormat myFormatter = new DecimalFormat("00000000");
			newSysReference.append(myFormatter.format(currentNumber));
		}
		return newSysReference.toString();
	}

}
