import java.util.ArrayList;
import java.util.Collections;

public class Randomizer {
    //Written by Gavin

    //I would have implemented this by making the amount of darts set as which indexes to check and compare to each other to reduce time complexity
    //I would have avoided any out of bounds errors by setting the smallest length as the length 
    //Unfortunately I did not have enough time to fully implement this
    
    public static ArrayList<Integer> randomize(int length){
        //Variables
        //Number of "Darts"
        int num = 15;
        //List same size as array length
        ArrayList<Integer> initialList = new ArrayList<Integer>();
        //List of "Darts" picked from the array
        ArrayList<Integer> randomArr = new ArrayList<Integer>();

        for (int i=0; i<length; i++){
            initialList.add(i);
        } 
        Collections.shuffle(initialList);
        for (int i=0; i<num; i++){
            randomArr.add(initialList.get(i));
        } 

        return randomArr;
    }
}