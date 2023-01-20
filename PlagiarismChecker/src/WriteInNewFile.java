import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;


// This method is used for the comparisons. It will write all the plagiarized sentences into a new file
public class WriteInNewFile {
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

