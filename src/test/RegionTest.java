package test;

/*
 *  @author Xiangkai Tang
 */

import org.junit.Test;
import static org.junit.Assert.*;
import region.*;

public class RegionTest {
	
	Region rg = new Romania(100,50,8,8);
	
	@Test
	public void testComputeRoamingTax(){
		double check = 0;
		double value;
		rg.computeRoamingTax(50);
		value = rg.getRoamingTax();
		assertTrue (value>check);
	}
}
