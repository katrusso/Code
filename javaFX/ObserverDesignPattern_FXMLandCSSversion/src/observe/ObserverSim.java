
package observe;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;


public class ObserverSim extends Application {
    
    @Override
    public void start(Stage stage) throws Exception {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("FXMLDocument.fxml") );
        Parent root = loader.load();
        
        Scene scene = new Scene(root); //could also insert loader.load() instead of 'root'
        
        stage.setScene(scene);
        
        ValueData vd = new ValueData();
        ObsDisplay obs1 = new ObsDisplay(vd);
        ObsDisplay obs2 = new ObsDisplay(vd);
        
        FXMLDocumentController controller = loader.<FXMLDocumentController>getController();
        controller.initialize(vd, obs1, obs2); //is this the best way to access these values in the document controller file?
        stage.show();
    }   
    
    public static void main(String[] args) {   
        launch(args);
    }   
    
}
