import java.io.File;
import java.io.FileInputStream;
import java.util.List;

import org.apache.poi.hwpf.HWPFDocument;
import org.apache.poi.hwpf.extractor.WordExtractor;
import org.apache.poi.xwpf.usermodel.XWPFDocument;
import org.apache.poi.xwpf.usermodel.XWPFParagraph;

public class fileReader {

  public static void readDocxFile(String fileName) {

		try {
			File file = new File(fileName);
			FileInputStream fis = new FileInputStream(file.getAbsolutePath());

			XWPFDocument document = new XWPFDocument(fis);

			List<XWPFParagraph> paragraphs = document.getParagraphs();

			System.out.println("Total no of paragraph "+ paragraphs.size());
			String count = "";
			for (XWPFParagraph para : paragraphs) {
				count += para.getText();
			}
			System.out.println(count);
			fis.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
}
    public static void main(String[] args) {

		readDocxFile("C:/Users/gtswo/Dropbox/PC/Documents/12-14-2022-PlagiarismChecker/PlagiarismChecker/testFiles/Planning Document(GW,EK,HM,ZK).docx");

	}
}
