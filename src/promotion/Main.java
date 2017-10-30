package promotion;

import java.util.ArrayList;

import account.Account;
import account.EnterpriseAccount;
import region.Region; 
import promotion.PDFcreater;
import report.Report;



public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account surferpromotionEnterpriseAccount = new SurferPromotion(new EnterpriseAccount(10F,new Region("China"),new SurferPromotion(),"2017-10-29","083-52163587")); 
		Report r = surferpromotionEnterpriseAccount.generateReport();
		PDFcreater pdf = new PDFcreater(r);
		pdf.outputPDF("Conrad");
			
		
	}

}
