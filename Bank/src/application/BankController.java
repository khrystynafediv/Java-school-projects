package application;

import java.io.IOException;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

public class BankController {
	@FXML public Label idLabel1, idChoose;
	@FXML Button btnMetal, btnGlass, btnWooden;
	@FXML ImageView idImg1, idImg2, idImg3;
	
	//onAction
	@FXML public void goMetal() {
	//useless thing here
	}
	
	@FXML public void goGlass() {
    //useless thing here
	}
	
	@FXML public void goWooden() {
    //useless thing here	
	}
	
	/*@FXML void initialize() {
		 btnWooden.setOnAction(event -> {		
			 
		try {
			FXMLLoader loader = new FXMLLoader(getClass().getResource("Wooden.fxml"));
			Parent root = loader.load(getClass().getResource("Wooden.fxml"));
			Stage stage = new Stage();	
			stage.setScene(new Scene(root));
			
		 } catch (IOException e) { e.printStackTrace(); }
		 Stage stage = new Stage();	
		 stage.setResizable(false);
		 stage.showAndWait();
		 }); */
	
	@FXML void initialize() {
		 btnWooden.setOnAction(event -> {
	     btnWooden.getScene().getWindow().hide();
	     FXMLLoader loader = new FXMLLoader(getClass().getResource("Wooden.fxml"));
		try {
		 loader.load();
		 } catch (IOException e) {}
		 Parent root = loader.getRoot();
		 Stage stage = new Stage();
		 stage.setScene(new Scene(root));
		 stage.setResizable(false);
		 stage.show();
		 });
		 
		 btnMetal.setOnAction(event -> {
			 btnMetal.getScene().getWindow().hide();
		     FXMLLoader loader = new FXMLLoader(getClass().getResource("Metal.fxml"));
			try {
			 loader.load();
			 } catch (IOException e) {}
			 Parent root = loader.getRoot();
			 Stage stage = new Stage();
			 stage.setScene(new Scene(root));
			 stage.setResizable(false);
			 stage.showAndWait();
			 });
		 
		 btnGlass.setOnAction(event -> {
			 btnGlass.getScene().getWindow().hide();
		     FXMLLoader loader = new FXMLLoader(getClass().getResource("Glass.fxml"));
			try {
			 loader.load();
			 } catch (IOException e) {}
			 Parent root = loader.getRoot();
			 Stage stage = new Stage();
			 stage.setScene(new Scene(root));
			 stage.setResizable(false);
			 stage.showAndWait();
			 });
	
	}
}
