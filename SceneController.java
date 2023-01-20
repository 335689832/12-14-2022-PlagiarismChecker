import java.io.IOException;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;


public class SceneController {
 public void Open(String name)  {
   Parent root;
   try{
       root = FXMLLoader.load(getClass().getResource(name));
       Scene scene = new Scene(root);      
       Stage Stage = new Stage();
       Stage.setScene(scene);
       Stage.show();
       
      //used as an extention and is used to create new scene
   }
   catch (IOException e){}

}
   
}
