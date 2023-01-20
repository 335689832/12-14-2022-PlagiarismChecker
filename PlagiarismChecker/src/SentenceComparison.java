import java.util.ArrayList;

public class SentenceComparison {

  public static double compare(ArrayList<String> arr1, ArrayList<String> arr2, int[] num){
    double percentage = 0;
    int l1;
    int l2;
    int counter = 0;
    Boolean inverseOrder = false;

    if(arr1.size() > arr2.size()){
      l1 = arr1.size();
      l2 = arr2.size();
    }
    else{
      l1 = arr2.size();
      l2 = arr1.size();
      inverseOrder = true;
    }

    if(inverseOrder){
      for(int i = 0; i < l1; i++){
        for(int j = 0; j < l2; j++){
          double comparePercent = stringPercent.Similarity(arr1.get(j), arr2.get(i));
          if(comparePercent > 15){
            percentage++;
          }
          counter++;
        }
        
      }
    }
    else{
      for(int i = 0; i < l1; i++){
        for(int j = 0; j < l2; j++){
          double comparePercent = stringPercent.Similarity(arr1.get(i), arr2.get(j));
          if(comparePercent > 15){
            percentage++;
          }
          counter++;
        }
      }
    }
    return (percentage/counter)*100;
  }

}
