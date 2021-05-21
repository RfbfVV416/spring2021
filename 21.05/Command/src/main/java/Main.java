import Command.CommandExecutor;
import Command.ExecuteCommand;
import Command.StrFromFile;
import Observer.Phone;
import Observer.UpdateCenter;
import Observer.Version;

public class Main {
    public static void main(String[] args) {

        //command
        StrFromFile strFromFile = new StrFromFile("D:\\text.txt");
        CommandExecutor commandExecutor = new CommandExecutor();
        commandExecutor.executeOperation(new ExecuteCommand(strFromFile, "456"));
        System.out.println(strFromFile.getStr());
        commandExecutor.undo();
        System.out.println(strFromFile.getStr());

    }
}
