package promotion;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.awt.Color;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
 

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Element;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account surferpromotionEnterpriseAccount = new SurferPromotion(new EnterpriseAccount());
		Document document = new Document();
        try {
            PdfWriter writer = PdfWriter.getInstance(document, new FileOutputStream("Receipt.pdf"));
            document.open();
            document.add(new Paragraph("Name:"));
            document.add(new Paragraph("SpentMinutes:"));
            document.add(new Paragraph("SpentMessages:"));
            document.add(new Paragraph("UsedMobileData"));
            document.add(new Paragraph("LeftMinutes:"));
            document.add(new Paragraph("LeftMessages:"));
            document.add(new Paragraph("LeftMobileData:"));
            document.add(new Paragraph("CostUntilNow:"));
            document.close();
            writer.close();
        } catch (DocumentException e) {
            e.printStackTrace();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
			
		
	}

}
