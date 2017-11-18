package test;

/*
 * @author Xiangkai Tang
 */

import org.junit.Test;
import customer.Customer;
import account.EnterpriseAccount;
import static org.junit.Assert.*;
import region.Romania;
import promotion.*;

public class TravelerPromotionTest {
	
	Customer conrad = new Customer("140556235", "conrad", 21, "Troy", "Active");
	TravelerPromotion tp = new TravelerPromotion(new EnterpriseAccount(10,new Romania(),conrad,"2017-5-5","083-123456"));
	
	@Test
	public void testGenerateReport(){
		assertNotNull(tp.generateReport(10, 20, 30, 40,50));
	}
}
