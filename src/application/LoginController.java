package application;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class LoginController {
	
	@FXML
	private Label lblStatus;	
	@FXML
	private TextField txtUserName;
	@FXML
	private TextField txtPassword;
	
	public void Login(ActionEvent event) throws Exception{
		if(txtUserName.getText().equals("User") && txtPassword.getText().equals("pass")){
			lblStatus.setText("Login Success");
			Stage primaryStage = new Stage();
			Parent root = FXMLLoader.load(getClass().getResource("/application/Login2.fxml"));
			Scene scene = new Scene(root,500,500);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.show();
			
		}else{
			lblStatus.setText("Login Failed");
		}	
	}//end login
}//class
