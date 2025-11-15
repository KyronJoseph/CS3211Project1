package edu.westga.cs3211.project1.view;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;

public class LandingPageCrewmateCodeBehind {
	

    @FXML
    private Pane ViewPane;
    
    @FXML
    private Button addStockBtn;
    
    @FXML
    private Button logoutBtn;
    
    @FXML
    private Button homeBtn;
    
  
    
    @FXML
    void addItemOnAction(ActionEvent event) throws IOException {
    	FXMLLoader loader = new FXMLLoader(getClass().getResource("AddItemView.fxml"));
    	Pane newContent = loader.load();
        ViewPane.getChildren().clear();
        ViewPane.getChildren().add(newContent);

    }

    @FXML
    void logOutOnAction(ActionEvent event) throws IOException {
    	FXMLLoader loader = new FXMLLoader(getClass().getResource("LoginView.fxml"));
    	Pane newContent = loader.load();
        ViewPane.getChildren().clear();
        ViewPane.getChildren().add(newContent);
        

    }
    
    @FXML
    void goHomeOnAction(ActionEvent event) throws IOException {
    	FXMLLoader loader = new FXMLLoader(getClass().getResource("HomepageView.fxml"));
    	Pane newContent = loader.load();
        ViewPane.getChildren().clear();
        ViewPane.getChildren().add(newContent);

    }

}
