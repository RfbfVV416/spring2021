package Command;

import java.util.ArrayList;
import java.util.List;

public class CommandExecutor {
    private final List<Command>  commandList = new ArrayList<>();
    public void executeOperation(Command command){
        commandList.add(command);
        command.execute();
    }

    public void undo(){
        int lastIndex;
        try{
            lastIndex = commandList.size() - 1;
            commandList.get(lastIndex).undo();
            commandList.remove(lastIndex);
        }
        catch (IndexOutOfBoundsException ex){
            ex.printStackTrace();
        }
    }
}
