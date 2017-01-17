package TextEditor;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.List;


public class Model {
      
	  public void save(TextFile textFile){
        try {
            Files.write(textFile.loadFile(), textFile.getContentFromFile(), StandardOpenOption.CREATE);
        }
        catch(IOException e){    // We have to do this, as there is a non-catched exception - IOException
             e.printStackTrace();
        }
    }

    public InputOutputResult<TextFile> load(Path file){
        try {
            List<String> lines = Files.readAllLines(file);
            return new InputOutputResult<>(true, new TextFile(file, lines)); // successful result
        }
        catch(IOException e){
            e.printStackTrace();
            return new InputOutputResult<>(false, null); // not successful result
        }
    }
     public void close(){
         System.exit(0);
     }
}
