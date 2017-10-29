package promotion;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import report.Report;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Element;

public class PDFcreater {
    Report r;
	private float spentMinutes = 0 ;
	private float spentMessages = 0;
	private float usedMobileData = 0;
	private float leftMinutes = 0;
    private float leftMessages = 0;
    private float leftMobileData = 0;
    private float CostUntilNow = 0;
	public void outputPDF(String Customer)
	{
		Document document = new Document();
        try {
            PdfWriter writer = PdfWriter.getInstance(document, new FileOutputStream("Receipt.pdf"));
            document.open();
            document.add(new Paragraph("Name:"+Customer));
            document.add(new Paragraph("SpentMinutes:"+spentMinutes));
            document.add(new Paragraph("SpentMessages:"+spentMessages));
            document.add(new Paragraph("UsedMobileData"+usedMobileData));
            document.add(new Paragraph("LeftMinutes:"+leftMinutes));
            document.add(new Paragraph("LeftMessages:"+leftMessages));
            document.add(new Paragraph("LeftMobileData:"+leftMobileData));
            document.add(new Paragraph("CostUntilNow:"+CostUntilNow));
            document.close();
            writer.close();
        } catch (DocumentException e) {
            e.printStackTrace();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        
	}
	public PDFcreater(Report r) {
		super();
		this.r = r;
	}
}
