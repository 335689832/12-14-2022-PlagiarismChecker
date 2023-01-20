import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class Choose_Pchecker extends SceneController {

    String fileselect;

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
        Open("Main_checker.fxml");
        //when clicked it creates/moves to the previous page

    }

    @FXML
    void NextPage2(ActionEvent event) {
        Open("result_checker.fxml");
        //when clicked it creates/moves to the next page 
        fileselect = CHeckFile.getText();
        System.out.println(fileselect);
        // saves and prints the fileselection made from the Textfield
    }

    @FXML
    void btnViewFileList(ActionEvent event) {
        for (String i : Main_Pchecker.getFileName()) {
            System.out.println(i);
            TextArea.appendText(i);
            TextArea.appendText("\n");
            //when clicked it would transerfer the arraylist and add the array list to the textArea

          }

    
        }


    }



