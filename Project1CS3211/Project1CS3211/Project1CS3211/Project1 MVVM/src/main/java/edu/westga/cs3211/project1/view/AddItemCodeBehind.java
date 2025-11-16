package edu.westga.cs3211.project1.view;

import java.io.IOException;

import edu.westga.cs3211.project1.model.Inventory;
import edu.westga.cs3211.project1.model.Stock;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;

/**
 * this is the code behind class for addItem =
 * @author Kyron Joseph
 * @version 11/15/2025
 */
public class AddItemCodeBehind {
	
    @FXML
    private Pane viewPane;
	
    @FXML
    private TextField conditionBox;

    @FXML
    private Label conditionLabel;

    @FXML
    private TextField expBox;

    @FXML
    private Label expLabel;

    @FXML
    private TextField nameBox;

    @FXML
    private Label nameLabel;

    @FXML
    private Label noConLabel;

    @FXML
    private Label noNameLabel;

    @FXML
    private Button returnBtn;

    @FXML
    private Button submitBtn;
    
    @FXML
    private Label sizeLabel;
    
    @FXML
    private TextField sizeTxtBox;
    
    @FXML
    private Label specialQualLabel;
    
    @FXML
    private TextField qualTxtBox;
    
    @FXML
    void returnOnAction(ActionEvent event) throws IOException {
    	FXMLLoader loader = new FXMLLoader(getClass().getResource("LandingPageQuaterMaster.fxml"));
    	Pane newContent = loader.load();
        this.viewPane.getChildren().clear();
        this.viewPane.getChildren().add(newContent);
    }

    @FXML
    void submitOnAction(ActionEvent event) {
    	Stock stock1 = new Stock(this.sizeTxtBox.getText(), this.qualTxtBox.getText(), this.nameBox.getText(), this.conditionBox.getText(), this.expBox.getText());
        Inventory inv = new Inventory();
        inv.addStockToCompartment1(stock1);
    	Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
        alert.setTitle("Youve added an Item");
        alert.setHeaderText(this.nameBox.getText());
        alert.setContentText("You added a new item the stock");
        alert.show();
        this.clearBoxes();
    }
    
    /**
     * this method will clear the text boxes 
     */
    private void clearBoxes() {
    	this.nameBox.clear();
    	this.conditionBox.clear();
    	this.expBox.clear();
    	this.qualTxtBox.clear();
    	this.sizeTxtBox.clear();
    }

}
