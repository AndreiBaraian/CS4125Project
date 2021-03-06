package test;

/*
 *@author Xiangkai Tang 
 */

import org.junit.Test;
import region.*;
import customer.Customer;
import static org.junit.Assert.*;
import promotion.*;
import account.*;

public class SurferPromotionTest {
	
	Customer conrad = new Customer("140556235", "conrad", 21, "Troy", "Active");
	SurferPromotion SurferPromotionEnterpriseAccount = new SurferPromotion(new EnterpriseAccount(10,new Romania(),conrad,"2017-5-5","083-123456"));
	
	@Test
	public void testGenerateReport(){
		assertNotNull(SurferPromotionEnterpriseAccount.generateReport(10, 20, 30, 40, 50));
	}
}
