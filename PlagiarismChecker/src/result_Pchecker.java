import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class result_Pchecker {

    @FXML
    private Button btnViewResult;

    @FXML
    private Label result;

    @FXML
    void btnViewResults(ActionEvent event) {
        for(int i = 0; i < Choose_Pchecker.getResultArr().size(); i++){
            result.setText(Choose_Pchecker.getResultArr().get(i));
        }
        //when clicked it shows the results from the main 

    }

}
