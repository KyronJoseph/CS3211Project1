package edu.westga.cs3211.project1.view;

import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.layout.Pane;

/**
 * this class is the CodeBehind for the review Stock changes page
 * @author Kyron Joseph
 * @version 11/15/2025
 */
public class StockChangesCodeBehind {
	
	@FXML
    private Button goBackBtn;
    
    @FXML
    private ListView<String> stockList;

    @FXML
    private Pane viewPane;
    
    @FXML
    void goBackOnAction(ActionEvent event) throws IOException {
    	FXMLLoader loader = new FXMLLoader(getClass().getResource("LandingPageQuaterMaster.fxml"));
    	Pane newContent = loader.load();
        this.viewPane.getChildren().clear();
        this.viewPane.getChildren().add(newContent);

    }
   
}
