package application;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.stage.FileChooser;

public class FileController {

	@FXML private Button selectfile;
	@FXML private Button open;
	@FXML private Button clearbtn;
	@FXML private Label label;
	@FXML private Label windowlabel;
	@FXML private TextArea txtarea;
	@FXML private TextField filepath;
	@FXML private ListView<File> listview;
	public String path; 
		
	public void ButtonAction(ActionEvent event) throws IOException{
		FileChooser fc = new FileChooser();
		File selectedFile = fc.showOpenDialog(null);
		
		if(selectedFile != null){
			path = selectedFile.toString();
			filepath.setText(path);
			System.out.println(selectedFile);
			}	
		}//end button
	
	
	public void OpenFile(ActionEvent event) throws IOException{
		
		if(path == null){
			path = "No File Selected";
			txtarea.setText(path);
			path = null;
		}else{
			String stringText;
			
			stringText = ReadFile(path);
			stringText = stringText.replaceAll("\\s*\\([^\\)]*\\)\\s*", "");
			stringText = stringText.replaceAll(";", " ");
			stringText = stringText.replaceAll(",", "\n");
			txtarea.setText(stringText);
			//scandoc();
		}
					
	}//OpenFile
	
	public String ReadFile(String FileLocation) throws IOException{
		
		FileReader file = new FileReader(FileLocation);
		BufferedReader reader = new BufferedReader(file);	
		String fileText = reader.readLine();
		reader.close();
		return fileText;
		
	}//ReadFile

	public void clearText(){
		txtarea.setText(" ");
		path = "";
		filepath.setText(null);		
		filepath = null;
		
		
	}//cleartext
	
	/*public void scandoc() throws IOException{
		
		Scanner scan = new Scanner(ReadFile(path));	
		scan.useDelimiter(",");
		
		while(scan.hasNextLine()){					
			txtarea.appendText(scan.next() + "\n");			
		}
		scan.close();		
	}*/
	
}//end main controller
