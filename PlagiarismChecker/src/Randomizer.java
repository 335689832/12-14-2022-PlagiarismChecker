import java.util.ArrayList;
import java.util.Random;

public class Randomizer {
    public static ArrayList<Integer> randomize(int length){
        int num = 15;
        int temp;
        Random rand = new Random();
        ArrayList<Integer> randomArr = new ArrayList<Integer>();
        for(int i = 0; i < num; i++){
            temp = rand.nextInt(length);
            for(int j = 0; j< num; j++){
                if(!(randomArr.get(j) == temp)){
                    randomArr.set(i, temp);
                    break;
                }
                temp = rand.nextInt(length);
                
            }       
        }
        for(int i = 0; i < randomArr.size(); i++){
            System.out.println(randomArr.get(i));
        }
        return randomArr;
    }

    public static void main(String[] args){
        ArrayList<Integer> n = randomize(30);
    }
}