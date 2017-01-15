package TextEditor;

import javafx.fxml.FXML;
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
     System.exit(0);
    }
    @FXML
    private void onAbout(){

    }
}
