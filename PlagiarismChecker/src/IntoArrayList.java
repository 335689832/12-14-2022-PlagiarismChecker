import java.util.ArrayList;

public class IntoArrayList {
    public static void addTo2DList(String input, ArrayList<ArrayList<String>> list2D) {
        String[] splitString = input.split("[.?!]"); // split the input string by periods, question marks or exclamation marks
        ArrayList<String> OneDList = new ArrayList<String>(); // Creates a 1D list
        for (String x : splitString) {
            OneDList.add(x);
        }
        list2D.add(OneDList);
    }
}