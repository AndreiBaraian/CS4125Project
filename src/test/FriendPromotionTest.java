package test;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import customer.Customer;
import account.EnterpriseAccount;
import static org.junit.Assert.*;
import region.Romania;
import report.Report;
import promotion.*;

public class FriendPromotionTest {
	Customer conrad = new Customer("140556235", "conrad", 21, "Troy", "Active");
	FriendPromotion fp = new FriendPromotion(new EnterpriseAccount(10,new Romania(),conrad,"2017-5-5","083-123456"));
	
	@Test
	public void testGenerateReport(){

		assertNotNull(fp.generateReport(10, 20, 30, 40, 50, 60, 70));
	}
}
