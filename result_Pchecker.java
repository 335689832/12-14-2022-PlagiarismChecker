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
        result.setText(App.getResultData());
        //when clicked it shows the results from the main 

    }

}
