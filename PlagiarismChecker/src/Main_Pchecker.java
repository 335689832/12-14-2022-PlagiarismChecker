import java.io.File;
import java.util.ArrayList;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.FileChooser;

public class Main_Pchecker extends SceneController {
    //Written by Evan
    //Class variables
    private static int percentage;

    private static ArrayList<Essay> masterArr = new ArrayList<Essay>();

    @FXML
    private Button FileEnter;

    @FXML
    private TextField Simpercent;

    @FXML
    private Button ViewResults;


    public String fileName;


    @FXML
    void FileImport(ActionEvent event) {
        FileChooser Fc = new FileChooser();
        File F = Fc.showOpenDialog(App.getMainStage());
        masterArr.add(new Essay(F));      
        //adds new essay based on file picked in dialogue box
    }
    
    @FXML
    void NextPage1(ActionEvent event) {
        //Move to next page if valid integer is entered in the text area
        try{
            percentage = Integer.parseInt(Simpercent.getText());
            Open("fxml/Choose_checker.fxml");
        }
        catch(NumberFormatException e){
            System.out.println("Please enter a valid integer");
        }
  
    }
    
    public static ArrayList<Essay> getEssayList(){
        return masterArr;
    }
    
    public static int getPercent(){
        return percentage;
    }
}

