package test;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import region.*;
import customer.Customer;
import static org.junit.Assert.*;
import report.Report;
import promotion.*;
import account.*;

public class SurferPromotionTest {
	Customer conrad = new Customer("140556235", "conrad", 21, "Troy", "Active");
	Account SurferPromotionEnterpriseAccount = new SurferPromotion(new EnterpriseAccount(10,new Romania(),conrad,"2017-5-5","083-123456"));
	
	@Test
	public void testGenerateReport(){
		assertNotNull(SurferPromotionEnterpriseAccount.generateReport(20, 20, 10, 30, 40, 50, 70));
	}
}
