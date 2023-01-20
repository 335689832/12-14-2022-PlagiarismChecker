import java.util.ArrayList;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class Choose_Pchecker extends SceneController {

    String fileselect;

    private ArrayList<Essay> tempArr = Main_Pchecker.getEssayList();

    private static ArrayList<String> resultArr = new ArrayList<String>();

    @FXML
    private TextField CHeckFile;

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
        Open("fxml/result_checker.fxml");
        //when clicked it creates/moves to the next page 
        fileselect = CHeckFile.getText();
        System.out.println(tempArr.size());
        for(int i = 0; i < tempArr.size(); i++){
            System.out.println("outer: " + i);
            for(int j = i+1; j < tempArr.size(); j++){
                System.out.println("inner: " + j);
                Double comPercent = SentenceComparison.compare(tempArr.get(i).getSentences(), tempArr.get(j).getSentences(), null);
                System.out.println(tempArr.get(i).getFile().getName() + " has a " + comPercent + "% similarity to " + tempArr.get(j).getFile().getName());
                if(Main_Pchecker.getPercent()< comPercent){
                    resultArr.add(tempArr.get(i).getFile().getName() + " has a " + comPercent + "% similarity to " + tempArr.get(j).getFile().getName());
                }
            }   
        }
        // saves and prints the fileselection made from the Textfield
    }

    @FXML
    void btnViewFileList(ActionEvent event) {
        ArrayList<Essay> tempArr = Main_Pchecker.getEssayList();
        for(int i = 0; i < tempArr.size(); i++){
            TextArea.appendText(tempArr.get(i).getFile().getName());
            TextArea.appendText("\n");
            //when clicked it would transerfer the arraylist and add the array list to the textArea
        }
    }

    public static ArrayList<String> getResultArr(){
        return resultArr;
    }
}



