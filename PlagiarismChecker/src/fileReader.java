import java.io.File;
import java.io.FileInputStream;
import java.util.List;

import org.apache.poi.xwpf.usermodel.XWPFDocument;
import org.apache.poi.xwpf.usermodel.XWPFParagraph;


/**
  * @param filename the file being read 
  * @return count the contents of the file 
  */
public class fileReader {
  public static String readDocxFile(String fileName) {
	//Written by Zara
		String count = "";
		try {
			File file = new File(fileName);
			FileInputStream fis = new FileInputStream(file.getAbsolutePath());

			XWPFDocument document = new XWPFDocument(fis);

			List<XWPFParagraph> paragraphs = document.getParagraphs();

			for (XWPFParagraph para : paragraphs) {
				count += para.getText();
			}
			fis.close();
		} 
		catch (Exception e) {
			e.printStackTrace();
		}
		return count;
	}
}
