import java.util.Random;

public class Randomizer {
    public static int[] randomize(int l1, int l2){
        int num = 15;
        int temp;
        Random rand = new Random();
        int[] randomArr = new int[num];
        if(l1 > l2){
            for(int i = 0; i < num; i++){
                temp = rand.nextInt(l2);
                for(int j = 0; j< num; j++){
                    if(!(randomArr[j] == temp)){
                        randomArr[i] = temp;
                        break;
                    }
                }       
            }
        }
        else{
            for(int i = 0; i < num; i++){
                temp = rand.nextInt(l1);
                for(int j = 0; j< num; j++){
                    if((randomArr[j] == temp)){
                        System.out.println("Match");
                    }
                    if(!(randomArr[j] == temp)){
                        randomArr[i] = temp;
                        break;
                    }
                }       
            }
        }
        return randomArr;
    }
}
