import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

/*
 * Write all the plagiarized essay into a txt file
 * @param theList
 * @param fileName
 */
public class WriteInNewFile {
    //Written by Zara and Himesh
    public static void writeArrayListToFile(ArrayList<String> list, String fileName) {
        try {
            FileWriter writer = new FileWriter(fileName);

            for (String s : list) {
                writer.write(s + "\n");
            }

            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

