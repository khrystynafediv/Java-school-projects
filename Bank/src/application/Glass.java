package application;

import java.io.IOException;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class Glass {
	@FXML private Button btnReturn, btnCalc;
	@FXML private TextField fieldStartSum, fieldNumberPeriod, fieldFinalSum;
	@FXML void initialize() {
		 btnReturn.setOnAction(event -> {
	     btnReturn.getScene().getWindow().hide();
	     FXMLLoader loader = new FXMLLoader(getClass().getResource("Bank.fxml"));
		try {
		 loader.load();
		 } catch (IOException e) {}
		 Parent root = loader.getRoot();
		 Stage stage = new Stage();
		 stage.setScene(new Scene(root));
		 stage.setResizable(false);
		 stage.show();
		 });
		 
		 btnCalc.setOnAction(event-> {
			 String StSum = fieldStartSum.getText().trim();
			 Double SS = null;	
			 
			try {
			SS = Double.valueOf(StSum);
			 } catch (NumberFormatException ex) {
			 Alert alert = new Alert(Alert.AlertType.INFORMATION);
			alert.setTitle("An exception occured");
			alert.setHeaderText(null);
			alert.setContentText("Please, enter the right value");
			alert.showAndWait();
			 }
			 String NumPeriod = fieldNumberPeriod.getText().trim();
			 Integer NP = null;
			 
			try {
			NP = Integer.parseInt(NumPeriod);
			 } catch (NumberFormatException ex) {
			 Alert alert = new Alert(Alert.AlertType.INFORMATION);
			alert.setTitle("An exception occured");
			alert.setHeaderText(null);
			alert.setContentText("Number of periods - integer number");
			alert.showAndWait();
			 }
			int i=1;
			do {
			i++;
			SS = SS + 0.15 * SS;
			 } 
			
			while (i<=NP);
			fieldFinalSum.setText(String.valueOf(SS)+" UAH");
			
		  		});
			 }
	 	{
	}
}
