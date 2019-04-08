import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;

import java.io.*;

public class PDFWriteTest {
    public static void main(String[] args) {
        try {
            Document document = new Document();

            OutputStream outputStream = new FileOutputStream(new File("E:\\Codes\\Java\\Lab 4\\src\\daD.pdf"));

            PdfWriter.getInstance(document, outputStream);
            document.open();

            document.add(new Paragraph("سلام," + "This is a test pdf file!"));


            document.close();
            outputStream.close();


            System.out.println("Pdf created sucessfully!");

        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
