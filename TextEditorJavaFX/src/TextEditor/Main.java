package TextEditor;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        FXMLLoader loader = new FXMLLoader(getClass().getResource("ui.fxml"));
        loader.setControllerFactory(t -> new Controller(new Model())); // we do this to pass the Model we created
        primaryStage.setTitle("TextEditor JavaFX");
        primaryStage.setScene(new Scene(loader.load()));
		primaryStage.getScene().setFill(Color.DIMGREY);  // some coloring on the scene to make more smooth outlook with css
        primaryStage.getIcons().add(new Image(getClass().getResource("editor.png").toExternalForm())); // setting the new icon and favicon
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
