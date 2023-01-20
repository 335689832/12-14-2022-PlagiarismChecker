import java.util.ArrayList;

public class IntoArrayList {
    /*
     * Splits the string by punctuation and is added to a 2D arrayList
     * @param essay; the string
     * @param twoDList
     */
    public static void addTo2DList(String essay, ArrayList<ArrayList<String>> twoDList) {
        String regexForSentence = "[.?!]";
        String[] splitString = essay.split(regexForSentence); // Split the input string by periods, question marks or exclamation marks
        ArrayList<String> oneDList = new ArrayList<String>(); // Creates a 1D list
        for (String x : splitString) {
            oneDList.add(x); // adds "x" into the 1D arrayList
        }
        twoDList.add(oneDList); // adds the 1D arrayList into the 2D arrayList
    }
}
