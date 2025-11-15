package edu.westga.cs3211.project1.view;

import java.io.IOException;

import edu.westga.cs3211.project1.model.Inventory;
import edu.westga.cs3211.project1.model.Stock;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
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
    private Pane ViewPane;
	
    @FXML
    private TextField conditionBox;

    @FXML
    private Label conditionLabel;

    @FXML
    private TextField expBox;

    @FXML
    private Label expLabel;

    @FXML
    private Label invalidLabel;

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
        this.ViewPane.getChildren().clear();
        this.ViewPane.getChildren().add(newContent);

    }

    @FXML
    void submitOnAction(ActionEvent event) {
    	Stock stock1 = new Stock(this.sizeTxtBox.getText(), this.qualTxtBox.getText(), this.nameBox.getText(), this.conditionBox.getText(), this.expBox.getText());
        Inventory inv = new Inventory();
        inv.addStock(stock1);
        this.invalidLabel.setText("You added a new item check the homepage to see it");
    }

}
