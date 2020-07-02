package patterns;

import java.util.ArrayList;
import java.util.List;

//A command
interface ILogMessageCommand {
    void LogMessage();
}

class LogMessagetoFileCommand implements ILogMessageCommand {

    public void LogMessage() {
        //interact with the receiver to process the command
        System.out.println("logs message in file");
    }

}

class LogMessageToDatabaseCommand implements ILogMessageCommand {

    public void LogMessage() {
        //interact with the receiver to process the command
        System.out.println("logs message to db");
    }
}

//Invoker
class LoggerFramework {
    List<ILogMessageCommand> _allCommands = null;

    //receive all commands
    public LoggerFramework(List allCommands) {
        _allCommands = allCommands;
    }

    //does not know concrete commands
    public void LogMessages() {
        for (ILogMessageCommand iLogMessageCommand : _allCommands) {
            iLogMessageCommand.LogMessage();
        }
    }
}

//client class
public class CommandPattern {
    public static void main(String[] args) {
        ILogMessageCommand LogMessageToFileCommand = new LogMessagetoFileCommand();
        ILogMessageCommand LogMessagetoDbCommand = new LogMessageToDatabaseCommand();

        List<ILogMessageCommand> _allCommands = new ArrayList<ILogMessageCommand>();
        _allCommands.add(LogMessageToFileCommand);
        _allCommands.add(LogMessagetoDbCommand);

        LoggerFramework framework = new LoggerFramework(_allCommands);
        //request the invoker to execute all commands
        framework.LogMessages();
    }
}
