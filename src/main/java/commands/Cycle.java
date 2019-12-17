package commands;

import transform.Cells;

import java.util.List;

public class Cycle implements MainCommand{
    List<MainCommand> mainCommands;

    public Cycle(List<MainCommand> mainCommands) {
        this.mainCommands = mainCommands;
    }

    public void runMethod(Cells cells) {
        do {
            for (MainCommand mainCommands : mainCommands) {
                mainCommands.runMethod(cells);
            }
        } while (cells.getCurrentMemoryByte() != 0);
    }

}
