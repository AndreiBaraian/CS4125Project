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
			    try
			    {
			        PdfWriter writer = PdfWriter.getInstance(document, new FileOutputStream("AddTableExample.pdf"));
			        document.open();
			 
			        PdfPTable table = new PdfPTable(3); // 3 columns.
			        table.setWidthPercentage(100); //Width 100%
			        table.setSpacingBefore(10f); //Space before table
			        table.setSpacingAfter(10f); //Space after table
			 
			        //Set Column widths
			        float[] columnWidths = {1f, 1f, 1f};
			        table.setWidths(columnWidths);
			 
			        PdfPCell cell1 = new PdfPCell(new Paragraph("Caller"));
			        cell1.setBorderColor(BaseColor.BLUE);
			        cell1.setPaddingLeft(10);
			        cell1.setHorizontalAlignment(Element.ALIGN_CENTER);
			        cell1.setVerticalAlignment(Element.ALIGN_MIDDLE);
			 
			        PdfPCell cell2 = new PdfPCell(new Paragraph("Date"));
			        cell2.setBorderColor(BaseColor.GREEN);
			        cell2.setPaddingLeft(10);
			        cell2.setHorizontalAlignment(Element.ALIGN_CENTER);
			        cell2.setVerticalAlignment(Element.ALIGN_MIDDLE);
			 
			        PdfPCell cell3 = new PdfPCell(new Paragraph("Region"));
			        cell3.setBorderColor(BaseColor.RED);
			        cell3.setPaddingLeft(10);
			        cell3.setHorizontalAlignment(Element.ALIGN_CENTER);
			        cell3.setVerticalAlignment(Element.ALIGN_MIDDLE);
			       		 
			        table.addCell(cell1);
			        table.addCell(cell2);
			        table.addCell(cell3);
			        
			        for (int i = 0; i < 2; i++) {
			            PdfPCell celli1 = new PdfPCell(new Paragraph("value1"));
			            PdfPCell celli2 = new PdfPCell(new Paragraph("value2"));
			            PdfPCell celli3 = new PdfPCell(new Paragraph("value3"));
			            table.addCell(celli1);
			            table.addCell(celli2);
			            table.addCell(celli3);
			        }
			        document.add(table);
			 
			        document.close();
			        writer.close();
			    } catch (Exception e)
			    {
			        e.printStackTrace();
			    }
			
		
	}

}
