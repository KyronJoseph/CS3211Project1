package edu.westga.cs3211.project1.view;

import edu.westga.cs3211.project1.model.Inventory;
import edu.westga.cs3211.project1.model.Stock;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.ListView;
import javafx.scene.layout.Pane;

public class HomePageCodeBehind {
	
	ObservableList<String> choices = FXCollections.observableArrayList("Compartment 1", "Compartment 2");
	
    @FXML
    private ChoiceBox<String> choiceBox = new ChoiceBox<>(choices);
    
    @FXML
    private Button submitBtn;

    @FXML
    private Pane viewPane;

}
