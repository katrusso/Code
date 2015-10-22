package fxmlexample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.text.Text;

public class FXMLExampleController {
    @FXML private Text actiontarget;
    
    @FXML protected void handleSubmitButtonAction(ActionEvent event) {
        actiontarget.setText("Sign in button pressed");
    } 
}

/*
 - makes the Text control display a message when the user presses the button.

- @FXML annotation is used to tag nonpublic controller member fields and 
handler methods for use by FXML markup.

- handleSubmitButtonAction() sets the actiontarget variable to the text when 
the user presses the button.

As an alternative to using Java code to create an event handler, you can create the 
handler with any language that provides a JSR 223-compatible scripting engine.
e.g. JavaScript, Groovy, Jython, Clojure.
*/