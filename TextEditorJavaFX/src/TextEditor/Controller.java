package TextEditor;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.TextArea;

public class Controller {

    @FXML
    private TextArea textArea;

    private Model model;

    public Controller(Model model){
        this.model = model;
    }
    @FXML
    private void onSave(){

    }
    @FXML
    private void onLoad(){

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
