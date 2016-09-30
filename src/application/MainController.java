package application;

import java.io.IOException;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class MainController {

	
	@FXML private Button filechooser;
	@FXML private Button calculator;
	@FXML private Button login;
	@FXML private Button execute;
	
	
	public void fileChooser() throws IOException{
		Stage primaryStage = new Stage();		
		Parent root = FXMLLoader.load(getClass().getResource("/application/File.fxml"));
		Scene scene = new Scene(root,500,500);
		scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
		primaryStage.setScene(scene);
		primaryStage.show();	
		
	}
	
	public void Calculator() throws IOException{
		Stage primaryStage = new Stage();		
		Parent root = FXMLLoader.load(getClass().getResource("/application/Calculator.fxml"));
		Scene scene = new Scene(root,500,500);
		scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
		primaryStage.setScene(scene);
		primaryStage.show();
		
	}
	
	public void Login() throws IOException{
		Stage primaryStage = new Stage();		
		Parent root = FXMLLoader.load(getClass().getResource("/application/Login.fxml"));
		Scene scene = new Scene(root,500,500);
		scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
		primaryStage.setScene(scene);
		primaryStage.show();
		
	}
	
	public void Execute() throws IOException{
		Stage primaryStage = new Stage();		
		Parent root = FXMLLoader.load(getClass().getResource("/application/Execute.fxml"));
		Scene scene = new Scene(root,500,500);
		scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
		primaryStage.setScene(scene);
		primaryStage.show();
		
	}
}
