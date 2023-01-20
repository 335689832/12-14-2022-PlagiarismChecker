import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

/*
 * Write all the plagiarized essay into a txt file
 * @param theList
 * @param fileName
 */
public class WriteInNewFile {
    public static void writeArrayListToFile(ArrayList<String> theList, String fileName) {
        try {
            FileWriter writing = new FileWriter(fileName);
            for (String s : theList) {
                writing.write(s + "\n");
            }
            writing.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

