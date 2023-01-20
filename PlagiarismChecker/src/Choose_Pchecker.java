import java.util.ArrayList;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;

public class Choose_Pchecker extends SceneController {
    //Written by Evan
    //Class variables
    String fileselect;

    private ArrayList<Essay> tempArr = Main_Pchecker.getEssayList();

    private static ArrayList<String> resultArr = new ArrayList<String>();

    @FXML
    private Button FileEnter;

    @FXML
    private Button GoingBack;

    @FXML
    private TextArea TextArea;

    @FXML
    private Button ViewFileList;

    @FXML
    void BackPage1(ActionEvent event) {
        Open("fxml/Main_checker.fxml");
        //when clicked it creates/moves to the previous page

    }

    @FXML
    void NextPage2(ActionEvent event) {
        //when clicked it creates/moves to the next page 
        Open("fxml/result_checker.fxml");
        
        //for each entry in the essayList, compare to the other essays
        for(int i = 0; i < tempArr.size(); i++){
            for(int j = i+1; j < tempArr.size(); j++){            
                //essay should not compare to itself
                if(i == j){
                    continue;
                }
    
                //Store percentage of similarity in a variable
                Double comPercent = SentenceComparison.compare(tempArr.get(i).getSentences(), tempArr.get(j).getSentences(), null);
                
                //Print comparison in terminal
                System.out.println(tempArr.get(i).getFile().getName() + " has a " + comPercent + "% similarity to " + tempArr.get(j).getFile().getName());
                
                //If comparison meets minimum threshold, display it in results screen
                if(Main_Pchecker.getPercent()< comPercent){
                    resultArr.add(tempArr.get(i).getFile().getName() + " has a " + comPercent + "% similarity to " + tempArr.get(j).getFile().getName());
                }
            }   
        }
    }

    @FXML
    void btnViewFileList(ActionEvent event) {
        //View list of essays in textArea
        ArrayList<Essay> tempArr = Main_Pchecker.getEssayList();
        for(int i = 0; i < tempArr.size(); i++){
            TextArea.appendText(tempArr.get(i).getFile().getName());
            TextArea.appendText("\n");
        }
    }

    public static ArrayList<String> getResultArr(){
        return resultArr;
    }
}



