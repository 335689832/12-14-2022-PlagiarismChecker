import java.io.File;
import java.util.ArrayList;

public class Essay {
    private File file;
    private String filePath;
    private String content;
    private ArrayList<String> sentenceArr;

    Essay(File file){
        this.file = file;
        this.filePath = file.toPath().toString();
        this.content = fileReader.readDocxFile((file.toPath()).toString());
        this.sentenceArr = divide(content);
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

    public String getFilePath(){
        return filePath;
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
