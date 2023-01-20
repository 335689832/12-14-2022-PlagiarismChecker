import java.io.File;
import java.util.ArrayList;

public class Essay {
    private File file;
    private String content;
    private ArrayList<String> sentenceArr;

    Essay(File file, ArrayList<ArrayList<String>> masterList){
        this.file = file;
        this.content = fileReader.readDocxFile((file.toPath()).toString());
        this.sentenceArr = divide(content);
        masterList.add(sentenceArr);
    }

    public File getFile(){
        return file;
    }

    public String getContent(){
        return content;
    }

    public ArrayList<String> getSentences(){
        return sentenceArr;
    }

    public static ArrayList<String> divide(String input) {
        String[] splitString = input.split("[.?!]"); // split the input string by periods, question marks or exclamation marks
        ArrayList<String> OneDList = new ArrayList<String>(); // Creates a 1D list
        for (String x : splitString) {
            OneDList.add(x);
        }
        return OneDList;
    }
}
