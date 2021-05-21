package Command;

public class ExecuteCommand implements Command{
    private StrFromFile strFromFile;
    private String str;

    public ExecuteCommand(StrFromFile strFromFile, String str){
        this.str = str;
        this.strFromFile = strFromFile;
    }

    @Override
    public void execute(){
        this.strFromFile.addSubstring(str);
    }

    @Override
    public void undo(){
        this.strFromFile.undoString(str);
    }
}
