/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package login;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;


/**
 *
 * @author hq
 */
public class Login extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("JavaFX Welcome");
        
        GridPane grid = new GridPane(); //enables you to create a flexible grid where you can put controls 
        grid.setAlignment(Pos.CENTER); //changes default grid position from top left to center
        grid.setHgap(10); //manages the spacing between rows and columns
        grid.setVgap(10); 
        grid.setPadding(new Insets(25, 25, 25, 25)); //manages the space around the edges of the grid pane.
                                                     //insets order: top, rt, btm, left   
       
        Text scenetitle = new Text("Welcome"); //can't be edited by user
        scenetitle.setId("welcome-text"); //create an id to reference each text node in the CSS
        grid.add(scenetitle, 0, 0, 2, 1); //scene title is added in col 0, row 0, with col span = 2, row span = 1
        
        Label userName = new Label("UserName");
        grid.add(userName, 0, 1); //(located on grid in col 0, row 1)
        
        TextField userTextField = new TextField();
        grid.add(userTextField, 1, 1); //col 1, row 1

        Label pw = new Label("Password");
        grid.add(pw, 0, 2);
        grid.setGridLinesVisible(false); //useful for debugging
        
        PasswordField pwBox = new PasswordField();
        grid.add(pwBox, 1, 2);
        
        Button btn = new Button("Sign in");
        HBox hbBtn = new HBox(10);
        hbBtn.setAlignment(Pos.BOTTOM_RIGHT); //sets an alignment for the button that is different from the alignment applied to other controls in the grid pane.
        hbBtn.getChildren().add(btn);//button is added to the child of the HBox pane
        grid.add(hbBtn, 1, 4); //the HBox pane is added to the grid in col 1, row 4
        
        final Text actiontarget = new Text(); //Text control for displaying a message once the button is pressed.
        grid.add(actiontarget, 1, 6);
        
        //make the button display the text msg when the user presses it:
        btn.setOnAction(new EventHandler<ActionEvent>(){ //method used to register an event handler that sets the action target object when user presses button
            
            @Override
            public void handle(ActionEvent e){
                actiontarget.setId("actiontarget"); //create an id to reference each text node in the CSS file
                actiontarget.setText("Sign in button pressed");
            }
        });
        
        Scene scene = new Scene(grid, 300, 275);//the grid pane is the root node
                                //as the window is resized, the nodes within the gridpane are resized
                                //width and height default to minimum size needed, if blank.
        primaryStage.setScene(scene);
        
        //initialize the style sheets variable of the Scene class to point to the CSS style sheet
        scene.getStylesheets().add(Login.class.getResource("Login.css").toExternalForm());
        
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
