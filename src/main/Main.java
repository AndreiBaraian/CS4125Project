package main;

import java.security.Provider.Service;
import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transaction;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import control.Control;
import dao.CallDAO;
import dao.SessionFactoryUtil;
import gui.Menu;
import region.Region;
import service.Call;
import account.*;
import account.Number;
import promotion.*;
import report.*;
import customer.*;

public class Main {

	public static void main(String[] args) {
		
		
		/*
		Customer conrad = new Customer("140556235", "conrad", 21, "Troy", "Active", "17080118@studentmail.ul.ie");
		Customer lucian = new Customer("140556235", "lucian", 21, "Troy", "Active", "17080118@studentmail.ul.ie");
		Customer andrei = new Customer("140556235", "andrei", 21, "Troy", "Active", "17080118@studentmail.ul.ie");
		
		
		Account SurferPromotionEnterpriseAccount = new SurferPromotion(new EnterpriseAccount(50,new Region("China"),new SurferPromotion(50, 365, 10, 1000),conrad,"2017-10-31","083-123456"),conrad);
		SurferPromotionEnterpriseAccount.generateReport(20, 20, 10, 30, 40, 50, 70);*/
		
		//Account TravelerPromotionEnterpriseAccount = new TravelerPromotion(new EnterpriseAccount(50,new Region("Romania"),new SurferPromotion(50, 365, 10, 1000),lucian,"2017-10-31","083-123456"),lucian);
		//TravelerPromotionEnterpriseAccount.generateReport(10, 20, 30, 50, 440, 50, 80);
		
		//Account FriendPromotionEnterpriseAccount = new TravelerPromotion(new EnterpriseAccount(50,new Region("Ireland"),new SurferPromotion(50, 365, 10, 1000),andrei,"2017-10-31","083-123456"),andrei);
		//FriendPromotionEnterpriseAccount.generateReport(10, 20, 30, 40, 50, 60, 70);
		
		/*
		Number n1 = new Number("083-1234567");
		Number n2 = new Number("083-123456789");
		Number n3 = new Number("083-987654321");
		List<Number> numbers = new ArrayList<Number>();
		numbers.add(n1);
		numbers.add(n2);
		numbers.add(n3);
		
		
		//Account SurferPromotionFamilyAccount = new SurferPromotion(new FamilyAccount(50,new Region("China"),conrad,new SurferPromotion(50, 365, 10, 1000),3,numbers),conrad);
		//SurferPromotionFamilyAccount.generateReport(10, 20, 30, 40, 50, 60, 70);
		
		//Account TravelerPromotionFamilyAccount = new SurferPromotion(new FamilyAccount(50,new Region("China"),conrad,new SurferPromotion(50, 365, 10, 1000),3,numbers),conrad);
		//TravelerPromotionFamilyAccount.generateReport(10, 20, 30, 40, 50, 60, 70);
		
		Account FriendPromotionFamilyAccount = new SurferPromotion(new FamilyAccount(50,new Region("China"),conrad,new SurferPromotion(50, 365, 10, 1000),3,numbers),conrad);
		FriendPromotionFamilyAccount.generateReport(10, 20, 30, 40, 50, 60, 70);*/
	}

}
