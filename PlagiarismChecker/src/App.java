import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class App extends Application {
    private static Stage primaryStage;

    @Override
    public void start(Stage primaryStage) {
        Parent root;
        try{
            root = FXMLLoader.load(getClass().getResource("fxml/Main_checker.fxml"));
            
            Scene scene = new Scene(root);
            primaryStage.setScene(scene);
            primaryStage.show();
        }
        catch (IOException e){}

    }

    public static Stage getMainStage(){
        return primaryStage;
    }

 public static void main(String[] args) {
        launch(args);
    }

}
