import java.util.ArrayList;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class result_Pchecker {

    @FXML
    private Button btnViewResult;
    
    @FXML
    private TextField fileNameTf;

    @FXML
    private TextArea resultTextArea;

    @FXML
    private Label textWriteLabel;

    @FXML
    private Button writeBtn;

    //shows the names of all essay files when clicked 
    @FXML
    void btnViewResults(ActionEvent event) {
        for(int i = 0; i < Choose_Pchecker.getResultArr().size(); i++){
            resultTextArea.setText("");
            resultTextArea.appendText(Choose_Pchecker.getResultArr().get(i));
            resultTextArea.appendText("\n");
        }
    }

    @FXML
    void writeBtnClick(ActionEvent event) {
        ArrayList<String> essayNames = new ArrayList<String>();
        for(int i = 0; i < Choose_Pchecker.getResultArr().size(); i++){
            essayNames.add(Choose_Pchecker.getResultArr().get(i));
        }
        WriteInNewFile.writeArrayListToFile(essayNames, fileNameTf.getText());
    }

}