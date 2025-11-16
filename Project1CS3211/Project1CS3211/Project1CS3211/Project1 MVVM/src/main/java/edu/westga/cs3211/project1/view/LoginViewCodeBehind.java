package edu.westga.cs3211.project1.view;

import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;

/**this class will hold the information of the user
 * @author Kyron Joseph
 * @version 11/9/2025
 */
public class LoginViewCodeBehind {
	
    @FXML
    private Pane viewPane;

    @FXML
    private Button loginBtn;
    
    @FXML
    private Label errorLabel;
    
    @FXML
    private Label passwordLabel;

    @FXML
    private TextField passwordTxt;

    @FXML
    private Label usernameLabel;

    @FXML
    private TextField usernameTxt;
     
    @FXML
    private void handleButtonClick(ActionEvent event) throws IOException {
    	if (this.usernameTxt.getText().equals("Wylder") && this.passwordTxt.getText().equals("Scavenger")) {
        	FXMLLoader loader = new FXMLLoader(getClass().getResource("LandingPageCrewmate.fxml"));
        	Pane newContent = loader.load();
            this.viewPane.getChildren().clear();
            this.viewPane.getChildren().add(newContent);
    	} 
    	if (this.usernameTxt.getText().equals("Duchess") && this.passwordTxt.getText().equals("Leader")) {
        	FXMLLoader loader = new FXMLLoader(getClass().getResource("LandingPageQuaterMaster.fxml"));
        	Pane newContent = loader.load();
            this.viewPane.getChildren().clear();
            this.viewPane.getChildren().add(newContent);	
    		
    	} else {
    		this.errorLabel.setText("Invalid Credentials");
    	}
    	
    }
    
	@FXML
	void initialize() {

		this.bindComponentsToViewModel();
	}
	
	private void bindComponentsToViewModel() {
	
	}
}
