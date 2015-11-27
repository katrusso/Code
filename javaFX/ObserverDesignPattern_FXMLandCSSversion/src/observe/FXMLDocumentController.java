/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package observe;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.text.Font;

/**
 *
 * @author hq
 */
public class FXMLDocumentController implements Initializable {
    
    @FXML
    private TextField subjectValue;
    @FXML
    private Label obs1Value;
    @FXML
    private Label obs2Value;
    @FXML
    private Button obs1Button;
    @FXML
    private Button obs2Button;
    @FXML
    private Label obs1Status;
    @FXML
    private Label obs2Status;
    @FXML
    private Button updateButton;
    
    
    ValueData vd;
    ObsDisplay obs1, obs2;
    @FXML
    private Label subjectLabel;
    @FXML
    private Label obs1Label;
    @FXML
    private Label obs2Label;
    @FXML
    private Label subjectLabelField;
    @FXML
    private Label obs1LabelField;
    @FXML
    private Label obs2LabelField;
    
    @Override
    public void initialize(URL location, ResourceBundle resources) {
        //
    }

    public void initialize(ValueData vd, ObsDisplay obs1, ObsDisplay obs2) {
        this.vd = vd;
        this.obs1 = obs1;
        this.obs2 = obs2;
    }    


    @FXML
    private void handleObs1ButtonPress(ActionEvent event) {
        if( obs1Button.getText().equals("Unregister") ){
            vd.removeObserver(obs1);
             obs1Status.setText("(Unregistered)");
             obs1Button.setText("Register");
        } else {
             vd.registerObserver(obs1);
             obs1Status.setText("(Registered)");
             obs1Button.setText("Unregister");
        }
    }
    @FXML
    private void handleObs2ButtonPress(ActionEvent event) {
        if( obs2Button.getText().equals("Unregister") ){
               vd.removeObserver(obs2);
                obs2Status.setText("(Unregistered)");
                obs2Button.setText("Register");
           } else {
                vd.registerObserver(obs2);
                obs2Status.setText("(Registered)");
                obs2Button.setText("Unregister");
           }
    }
    @FXML
     private void handleUpdateButtonPress(ActionEvent event) {
        vd.setData(subjectValue.getText());
        obs1Value.setText(obs1.getCurrentValue());
        obs2Value.setText(obs2.getCurrentValue());
    }
    
}
