
package observe;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.text.Text;


/**
 *
 * @author hq
 */
public class ObserverSimulation extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        ValueData vd = new ValueData();
        ObsDisplay obs1 = new ObsDisplay(vd);
        ObsDisplay obs2 = new ObsDisplay(vd);
        
        primaryStage.setTitle("Observer Design Pattern");
        
        GridPane grid = new GridPane(); //enables you to create a flexible grid where you can put controls 
        grid.setHgap(10); //manages the spacing between rows and columns
        grid.setVgap(10); 
        grid.setPadding(new Insets(25, 25, 25, 25)); //manages the space around the edges of the grid pane; insets order: top, rt, btm, left   
       
        Text sceneTitle1 = new Text("Subject"); //can't be edited by user
        sceneTitle1.setId("heading"); //create an id to reference each text node in the CSS
        grid.add(sceneTitle1, 0, 0, 2, 1); //scene title is added in col 0, row 0, with col span = 2, row span = 1
        
        
        Text sceneTitle2 = new Text("Observer 1");
        sceneTitle2.setId("heading");
        grid.add(sceneTitle2, 10, 0, 2, 1);
        
        Text sceneTitle3 = new Text("Observer 2");
        sceneTitle3.setId("heading");
        grid.add(sceneTitle3, 10, 6, 2, 1);
              
        Label subjectValue = new Label("Value:");
        grid.add(subjectValue, 0, 1); //(located on grid in col 0, row 1)
        
        Label obs1Value = new Label("Value:");
        grid.add(obs1Value, 10, 1);
        
        Label obs2Value = new Label("Value:");
        grid.add(obs2Value, 10, 7);
        
        Label regFlagObs1 = new Label("(Registered)");
        grid.add(regFlagObs1, 13, 0);

        Label regFlagObs2 = new Label("(Registered)");
        grid.add(regFlagObs2, 13, 6);
        
        TextField valueTextField = new TextField();
        grid.add(valueTextField, 1, 1); //col 1, row 1
       
        
        Label obs1Label = new Label();
        grid.add(obs1Label, 11, 1);
        
        Label obs2Label = new Label();
        grid.add(obs2Label, 11, 7);

        grid.setGridLinesVisible(false); //useful for debugging       
        
        Button btn = new Button("Update");
        HBox hbBtn = new HBox(10);
        //hbBtn.setAlignment(Pos.BOTTOM_RIGHT); //sets an alignment for the button that is different from the alignment applied to other controls in the grid pane.
        hbBtn.getChildren().add(btn);//button is added to the child of the HBox pane
        grid.add(hbBtn, 1, 4); //the HBox pane is added to the grid in col 1, row 4
        
        Button registerObs1 = new Button("Unregister Obs 1");
        //HBox registerObs1_hbBtn = new HBox(10);
        //hbBtn.setAlignment(Pos.TOP_RIGHT); //sets an alignment for the button that is different from the alignment applied to other controls in the grid pane.
        //hbBtn.getChildren().add(registerObs1);//button is added to the child of the HBox pane
        //grid.add(registerObs1_hbBtn, 12, 0); //the HBox pane is added to the grid in col 1, row 4
        grid.add(registerObs1, 12, 0); //the HBox pane is added to the grid in col 1, row 4

        
        Button registerObs2 = new Button("Unregister Obs 2");
        //HBox registerObs2_hbBtn = new HBox(10);
        //hbBtn.setAlignment(Pos.BOTTOM_RIGHT); //sets an alignment for the button that is different from the alignment applied to other controls in the grid pane.
        //hbBtn.getChildren().add(registerObs2);//button is added to the child of the HBox pane
        //grid.add(registerObs2_hbBtn, 12, 6); //the HBox pane is added to the grid in col 1, row 4
        grid.add(registerObs2, 12, 6); //the HBox pane is added to the grid in col 1, row 4

        
        final Text actiontarget = new Text(); //Text control for displaying a message once the button is pressed.
        grid.add(actiontarget, 1, 6);
        
        //make the button display the text msg when the user presses it:
        btn.setOnAction(new EventHandler<ActionEvent>(){ //method used to register an event handler that sets the action target object when user presses button
            @Override
            public void handle(ActionEvent e){
                actiontarget.setId("actiontarget"); //create an id to reference each text node in the CSS file
                actiontarget.setText("Update button pressed");
                vd.setData(valueTextField.getText());
                obs1Label.setText(obs1.getCurrentValue());
                obs2Label.setText(obs2.getCurrentValue());

            }
        });
        
        registerObs1.setOnAction(new EventHandler<ActionEvent>() {
           @Override
           public void handle(ActionEvent e){
               if( registerObs1.getText() == "Unregister Obs 1"){
                   vd.removeObserver(obs1);
                    registerObs1.setText("Register Obs 1");
                    regFlagObs1.setText("(Unregistered)");
               } else {
                    vd.registerObserver(obs1);
                    registerObs1.setText("Unregister Obs 1");
                    regFlagObs1.setText("(Registered)");

               }
               
           }
        });
        
        registerObs2.setOnAction(new EventHandler<ActionEvent>() {
           @Override
           public void handle(ActionEvent e){
               if( registerObs2.getText() == "Unregister Obs 2"){
                   vd.removeObserver(obs2);
                    registerObs2.setText("Register Obs 2");
                    regFlagObs2.setText("(Unregistered)");

               } else {
                    vd.registerObserver(obs2);
                    registerObs2.setText("Unregister Obs 2");
                    regFlagObs2.setText("(Registered)");

               }
               
           }
        });
        
        Scene scene = new Scene(grid, 900, 400);//the grid pane is the root node
                                //as the window is resized, the nodes within the gridpane are resized
                                //width and height default to minimum size needed, if blank.
        primaryStage.setScene(scene);
        
        //initialize the style sheets variable of the Scene class to point to the CSS style sheet
        scene.getStylesheets().add(ObserverSimulation.class.getResource("Observe.css").toExternalForm());
        
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       // ValueData vd = new ValueData();
        //ObsDisplay obs1 = new ObsDisplay(vd);
        //ObsDisplay obs2 = new ObsDisplay(vd);

       // vd.setData("55");
        //vd.setData("44");


//        vd.removeObserver(obs2);
        
  //      vd.setData("33");
        launch(args);
    }
    
}

