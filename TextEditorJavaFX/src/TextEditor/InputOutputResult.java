package TextEditor;

/**
 * Created by Soft on 17/01/2017.
 */
public class InputOutputResult<TextData> {
    private TextData data;
    private boolean check;

    public InputOutputResult(boolean check, TextData data){ // this is the constructor
        this.check = check;
        this.data = data;
    }
    public boolean  isCheck(){
        return check;
    }
    public boolean hasData(){
        return data!=null;    // return true if data is not null
    }
    public TextData getData(){
        return data;
    }

}

