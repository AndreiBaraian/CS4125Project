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
import account.*;

public class FamilyAccountTest {
	
		List<String> numbers = new ArrayList<>();
		
		@Test
		public void testGenerateReport(){
			String number = "083-1236547";
			numbers.add(number);
			Customer conrad = new Customer("140556235", "conrad", 21, "Troy", "Active");
			FamilyAccount fa = new FamilyAccount(10,new Romania(),conrad,numbers);
			assertNotNull(fa.generateReport(10, 20, 30, 40, 50,60));
		}
}
