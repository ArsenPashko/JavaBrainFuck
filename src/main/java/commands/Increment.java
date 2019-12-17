package commands;

import transform.Cells;

public class Increment implements MainCommand {
    @Override
    public void runMethod(Cells cells) {
        cells.increment();
    }
}
