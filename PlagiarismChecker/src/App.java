import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class App extends Application {
    //Project assembled by Gavin
    //Class variables
    private static Stage primaryStage;

    @Override
    public void start(Stage primaryStage) {
        //Create main scene
        Parent root;
        try{
            root = FXMLLoader.load(getClass().getResource("fxml/Main_checker.fxml"));
            
            Scene scene = new Scene(root);
            primaryStage.setScene(scene);
            primaryStage.show();
        }
        catch (IOException e){
            e.printStackTrace();
        }

    }

    public static Stage getMainStage(){
        return primaryStage;
    }

 public static void main(String[] args) {
        launch(args);
    }

}
