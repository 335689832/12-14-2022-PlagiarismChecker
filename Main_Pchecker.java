import java.io.File;
import java.util.ArrayList;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.FileChooser;

public class Main_Pchecker extends SceneController {
    
    int percentage;

    private static File F;

    private static ArrayList<String> fArrayList = new ArrayList<String>();
    //arraylist for file import
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
        this.F = Fc.showOpenDialog(App.getMainStage());
        fileName = Main_Pchecker.F.getName();
        fArrayList.add(fileName);      
        //when clicking file import button file name is saved and added to an arraylist
    }
    
    @FXML
    void NextPage1(ActionEvent event) {
        Open("Choose_checker.fxml");
        for (String i : fArrayList) {
            System.out.println(i);
          }
          percentage = Integer.parseInt(Simpercent.getText());
          System.out.println(percentage);
  
              }
        //when clicked it creates/moves to the next page while also prints the array list, while printing what was imputted from the textfile

    public static ArrayList<String> getFileName(){
        return fArrayList;
    }
    //arraylist method    

    }

