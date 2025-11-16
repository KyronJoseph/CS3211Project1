package edu.westga.cs3211.project1.view;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;

/**
 * this class is the CodeBehind class for the Crewmate
 * @author Kyron Joseph
 * @version 11/15/2025
 */
public class LandingPageCrewmateCodeBehind {
	
    @FXML
    private Pane viewPane;
    
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
        this.viewPane.getChildren().clear();
        this.viewPane.getChildren().add(newContent);

    }

    @FXML
    void logOutOnAction(ActionEvent event) throws IOException {
    	FXMLLoader loader = new FXMLLoader(getClass().getResource("LoginView.fxml"));
    	Pane newContent = loader.load();
        this.viewPane.getChildren().clear();
        this.viewPane.getChildren().add(newContent);
        
    }
    
    @FXML
    void goHomeOnAction(ActionEvent event) throws IOException {
    	FXMLLoader loader = new FXMLLoader(getClass().getResource("HomepageView.fxml"));
    	Pane newContent = loader.load();
        this.viewPane.getChildren().clear();
        this.viewPane.getChildren().add(newContent);

    }

}
