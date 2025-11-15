package edu.westga.cs3211.project1.view;

import java.io.IOException;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.layout.Pane;

public class StockChangesCodeBehind {
	
	@FXML
    private Button goBackBtn;
    
    @FXML
    private ListView<String> stockList;

    @FXML
    private Pane viewPane;
    
    @FXML
    void GoBackOnAction(ActionEvent event) throws IOException {
    	FXMLLoader loader = new FXMLLoader(getClass().getResource("LandingPageQuaterMaster.fxml"));
    	Pane newContent = loader.load();
        viewPane.getChildren().clear();
        viewPane.getChildren().add(newContent);

    }
    

}
