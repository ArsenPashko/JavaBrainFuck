import commands.MainCommand;
import transform.Cells;
import transform.CommandsTransform;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        String hello = "++++++++[>++++[>++>+++>+++>+<<<<-]>+>+>->>+[<]<-]>>.>---.+++++++..+++.>>.<-.<.+++.------.--------.>>+.>++.";

        Cells cells = Cells.getInstance();
        CommandsTransform commandsTransform = new CommandsTransform();
        List<MainCommand> mainCommands = commandsTransform.createFor(hello);
        for(MainCommand mainCommand : mainCommands){
            mainCommand.runMethod(cells);
        }
    }

}
