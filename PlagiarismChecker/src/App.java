import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
        ArrayList<String> test1 = new ArrayList<String>();
        test1.add("CHEEKI BREEKI IV DAMKE");
        test1.add("Electric Wind God Fist");
        test1.add("What the hell is wrong with you");
        
        ArrayList<String> test2 = new ArrayList<String>();
        test2.add("CHEEKI BREEKI IV DAMKE");
        test2.add("Electric Wind God Fist");
        test2.add("What the hell is wrong with you");

        System.out.println("has a "+ SentenceComparison.compare(test1, test2, Randomizer.randomize(test1.size(), test2.size()))+"% similarity");
    }
    
}
