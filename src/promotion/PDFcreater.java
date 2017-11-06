package promotion;

/*
 * @author Xiangkai Tang
 */

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.List;

import report.Report;
import account.*;
import account.Number;
import customer.Customer;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Element;

import customer.Customer;


public class PDFcreater {
    Customer customer;
    Report report;
	public void outputPDF()
	{
		Document document = new Document();
        try {
            PdfWriter writer = PdfWriter.getInstance(document, new FileOutputStream("Receipt.pdf"));
            document.open();
            document.add(new Paragraph("Name:"+customer.getName()));
            document.add(new Paragraph("SpentMinutes:"+report.getSpentMinutes()));
            document.add(new Paragraph("SpentMessages:"+report.getSpentMessages()));
            document.add(new Paragraph("UsedMobileData"+report.getUsedMobileData()));
            document.add(new Paragraph("LeftMinutes:"+report.getLeftMinutes()));
            document.add(new Paragraph("LeftMessages:"+report.getLeftMessages()));
            document.add(new Paragraph("LeftMobileData:"+report.getLeftMobileData()));
            document.add(new Paragraph("CostUntilNow:"+report.getCostUntilNow()));
            document.add(new Paragraph("MobileData:"+report.getMobileData()));
            document.add(new Paragraph("InternationalMinutes:"+report.getInternationalMinutes()));
            document.add(new Paragraph("DifferentProviderMinutes:"+report.getDifferentProviderMinutes()));
            document.add(new Paragraph("Enddate:"+report.getEndDate()));
            document.add(new Paragraph("Number:"+report.getNumber()));
            document.add(new Paragraph("NumberCount:"+report.getNumberCount()));
            if(report.getNumbers()!=null)
            {
            	int num = 1;
            	
            	for(String item: report.getNumbers())
            	{
            		document.add(new Paragraph("Number"+num+":"+item));
            		num++;
            	}
            }
            document.close();
            writer.close();
        } catch (DocumentException e) {
            e.printStackTrace();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        
	}
	public PDFcreater(Report r, Customer customer) {
		super();
		this.report = r;
		this.customer = customer;
	}
	
	
	
    
}
