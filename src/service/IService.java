package service;

/*
 * @author Xiangkai Tang
 */

public interface IService {
	
	 /*
	  * Apply price for the account
	  * @pre price != null && price >= 0
	  * @post @nochange
	  */
     public void applyPrice(double price);
     
     public void applyCustomerPrice(int duration, double roamingTax);
}
