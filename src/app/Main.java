
package app;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application{

    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("FXML.fxml"));
        
        stage.setTitle("IrisPredictor");
        stage.setScene(new Scene(root));
    }
    
    public static void main(String[] args) {
        launch(args);
    }
    
    
}
