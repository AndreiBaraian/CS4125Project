package test;

/*
 * @author Xiangkai Tang
 */

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class TestRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Result result = JUnitCore.runClasses(EnterpriseAccountTest.class,FamilyAccountTest.class,FriendPromotionTest.class,SurferPromotionTest.class,TravelerPromotionTest.class,RegionTest.class,TestAccountWithPromotion.class);
		
	      for (Failure failure : result.getFailures()) {
	         System.out.println(failure.toString());
	      }
	      System.out.println(result.wasSuccessful());
	}

}
