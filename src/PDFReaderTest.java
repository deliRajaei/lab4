import com.itextpdf.text.pdf.PdfReader;
import com.itextpdf.text.pdf.parser.PdfTextExtractor;

import java.io.IOException;

public class PDFReaderTest{

    public static void main(String[] args) {
        PdfReader pdfreader=null;
        try{
            pdfreader =new PdfReader("E:\\Codes\\Java\\Lab 4\\src\\test.pdf");
        }catch(Exception e){
            e.printStackTrace();
        }

        int pages=pdfreader.getNumberOfPages();
        System.out.println(""+pages);
        for (int i = 1; i <=pages ; i++) {
            String pageContent= null;
            try {
                pageContent = PdfTextExtractor.getTextFromPage(pdfreader,i);
            } catch (IOException e) {
                e.printStackTrace();
            }
            System.out.println("Content on Page"+i+":"+pageContent);
        }

    }
}