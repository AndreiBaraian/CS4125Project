package test;
/*
 * @author Xiangkai Tang
 */
import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import customer.Customer;
import static org.junit.Assert.*;
import region.Romania;
import report.Report;
import account.*;

public class FamilyAccountTest {
	
	
		
		@Test
		public void testGenerateReport(){
			List<String> numbers = new ArrayList<>();
			numbers.add("083-123456789");
			numbers.add("083-561561561");
			Customer conrad = new Customer("140556235", "conrad", 21, "Troy", "Active");
			FamilyAccount fa = new FamilyAccount(10,new Romania(),conrad,numbers);
			fa.setNumbersString("083-7654321");
			fa.setNumbers(numbers);
			assertNotNull(fa.generateReport(10, 20, 30, 40, 50, 60, 70));
		}
}
