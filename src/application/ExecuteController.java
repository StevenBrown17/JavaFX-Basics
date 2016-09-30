package application;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;

public class ExecuteController {

	@FXML private Button execute;
	@FXML private TextArea textbox;
	@FXML private Label label;
	
	public void ExecuteText(){
		label.setText(null);
		label.setText(textbox.getText());	
	}
}
