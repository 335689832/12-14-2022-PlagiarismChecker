import java.io.File;
import java.util.ArrayList;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.FileChooser;

public class Main_Pchecker extends SceneController {
    
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
        //when clicking file import button file name is saved and added to an arraylist
    }
    
    @FXML
    void NextPage1(ActionEvent event) {
        try{
            percentage = Integer.parseInt(Simpercent.getText());
            Open("fxml/Choose_checker.fxml");
        }
        catch(NumberFormatException e){
            System.out.println("Please enter a valid integer");
        }
  
    }
    
    //when clicked it creates/moves to the next page while also prints the array list, while printing what was imputted from the textfile
    public static ArrayList<Essay> getEssayList(){
        return masterArr;
    }
    //arraylist method    

    public static int getPercent(){
        return percentage;
    }

    }

