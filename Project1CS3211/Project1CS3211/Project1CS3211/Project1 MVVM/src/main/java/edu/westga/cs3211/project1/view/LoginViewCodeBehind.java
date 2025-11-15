package edu.westga.cs3211.project1.view;
import java.io.IOException;

import edu.westga.cs3211.project1.model.Authenticator;
import edu.westga.cs3211.project1.viewmodel.LoginViewViewModel;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

/**this class will hold the information of the user
 * @author Kyron Joseph
 * @version 11/9/2025
 */
public class LoginViewCodeBehind {
	
    @FXML
    private Pane ViewPane;

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
    
    private LoginViewViewModel viewModel;
    
    
    
    @FXML
    private void handleButtonClick(ActionEvent event) throws IOException {
    	if (this.usernameTxt.getText().equals("Wylder") && this.passwordTxt.getText().equals("Scavenger")) {
        	FXMLLoader loader = new FXMLLoader(getClass().getResource("LandingPageCrewmate.fxml"));
        	Pane newContent = loader.load();
            ViewPane.getChildren().clear();
            ViewPane.getChildren().add(newContent);
    	} if (this.usernameTxt.getText().equals("Duchess") && this.passwordTxt.getText().equals("Leader")) {
        	FXMLLoader loader = new FXMLLoader(getClass().getResource("LandingPageQuaterMaster.fxml"));
        	Pane newContent = loader.load();
            ViewPane.getChildren().clear();
            ViewPane.getChildren().add(newContent);	
    		
    	} else {
    		errorLabel.setText("Invalid Credentials");
    	}
    	
    }
    

    
    @FXML
    private void handleOpenNewWindowButton(ActionEvent event) throws IOException {
    	if (this.usernameLabel.getText().equals("Wylder") && this.passwordLabel.getText().equals("Scavenger")) {
    		FXMLLoader loader = new FXMLLoader(getClass().getResource("LandingPageCrewmate.fxml"));
        	Parent root = loader.load();
        	Stage newStage = new Stage();
        	newStage.setTitle("new window");
        	newStage.setScene(new Scene(root));
        	newStage.show();
    	} else {
    		
    	}
    	
    }
    
    public LoginViewCodeBehind() {
    	this.viewModel = new LoginViewViewModel();
    	
    	
    	
    }
    
    private void getLabelInformation() {
    	Authenticator auth1 = new Authenticator();
    	String  username = this.usernameLabel.getText();
        String  password = this.passwordLabel.getText();
        auth1.isCrewmate(username, password);
        auth1.isQuarterMaster(username, password);
      
    }
    
	@FXML
	void initialize() {

		this.bindComponentsToViewModel();
	}
	
	private void bindComponentsToViewModel() {
	
	}


}
