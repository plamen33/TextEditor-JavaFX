package TextEditor;

import java.nio.file.Path;
import java.util.List;

public class TextFile {

    private final Path file; // here we define the file

    private final List<String> content; // this list will store the lines of text - strings

    public TextFile(Path file, List<String> content){   // Constructor of the Text File
        this.file = file;
        this.content = content;
    }
    public Path loadFile(){
        return file;
    }

    public List<String> getContentFromFile(){
        return content;
    }


}
