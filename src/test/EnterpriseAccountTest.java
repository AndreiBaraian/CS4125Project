package test;

/*
 * @author Xiangkai Tang
 */

import org.junit.Test;
import static org.junit.Assert.*;
import account.*;
import customer.*;
import region.*;

public class EnterpriseAccountTest {
	 
	 Customer conrad = new Customer("140556235", "conrad", 21, "Troy", "Active");
	 EnterpriseAccount ea = new EnterpriseAccount(10,new Romania(),conrad,"2017-5-5","083-123456");
	 
	@Test
	public void testGenerateReport(){
		ea.setEndDate("2017-11-08");
		ea.setNumber("083-123456");
		assertNotNull(ea.generateReport(10, 20, 30, 40, 50,60));
	}

}
