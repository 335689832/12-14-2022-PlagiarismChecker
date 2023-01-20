import java.io.File;
import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
        ArrayList<ArrayList<String>> test1 = new ArrayList<ArrayList<String>>();
        
        try{
            File file = new File("C:/Users/gtswo/OneDrive/Documents/GitHub/12-14-2022-PlagiarismChecker/PlagiarismChecker/testFiles/Gavin Wong - Inquiry Essay.docx");
            System.out.println(file.getName());
            Essay t = new Essay(file, test1);
            Essay t2 = new Essay(file, test1);
            int[] r = new int[2];
            // ArrayList<String> tarr = t.getSentences();
            System.out.println("has a " + SentenceComparison.compare(t.getSentences(), t.getSentences(), r) + "% similarity");
        }
        catch(Exception e){
            System.out.println("big oof");
        }
    }
    
}
