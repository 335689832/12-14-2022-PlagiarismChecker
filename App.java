import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class App extends Application {
    private static Stage primaryStage;
    private static String resultTex = "placeholder";

    @Override
    public void start(Stage primaryStage) {
        Parent root;
        try{
            root = FXMLLoader.load(getClass().getResource("Main_checker.fxml"));
            
            Scene scene = new Scene(root);
            primaryStage.setScene(scene);
            primaryStage.show();
            

        }
        catch (IOException e){}

    }

    public static Stage getMainStage(){
        return primaryStage;
    }
    
    public static String getResultData(){
        return resultTex;
    }

 public static void main(String[] args) {
        launch(args);
    }

}
