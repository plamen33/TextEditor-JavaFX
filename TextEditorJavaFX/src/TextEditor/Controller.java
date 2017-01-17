package TextEditor;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.ContentDisplay;
import javafx.scene.control.TextArea;
import javafx.stage.FileChooser;

import java.io.*;
import java.util.Arrays;


public class Controller {

    @FXML
    private TextArea textArea;
	
	private TextFile currentTextFile;

    private Model model; 

    public Controller(Model model){
        this.model = model;
    }
    @FXML
    private void onSave(){
       TextFile textFile = new TextFile(currentTextFile.loadFile(), Arrays.asList(textArea.getText().split("\n")));
       model.save(textFile);
    }
    @FXML
    private void onLoad(){
		FileChooser fileChooser = new FileChooser();
        fileChooser.setTitle("Choose file to open");
        fileChooser.setInitialDirectory(new File("./"));  // ./ - means the Directory where the program started
        File file =  fileChooser.showOpenDialog(null);
        if(file!=null){
          InputOutputResult<TextFile> io =   model.load(file.toPath());

            if (io.isCheck() && io.hasData()){
                currentTextFile = io.getData();
                textArea.clear();
                currentTextFile.getContentFromFile().forEach(line ->textArea.appendText(line + "\n"));
            }
            else{
               System.out.println("Loading failed. File cannot be rendered.");
            }
        }
    }
    @FXML
    private void onClose(){
      model.close();
    }
    @FXML
    private void onAbout(){
        Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
        alert.setHeaderText("Text Editor JavaFX");
        alert.setTitle("About");
        alert.setContentText("TextEditor version 1.0 developed with Java.\nPowered by Java 8");
        alert.show();
    }
}
