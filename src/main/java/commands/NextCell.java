package commands;

import transform.Cells;

public class NextCell implements MainCommand {
    @Override
    public void runMethod(Cells cells) {
        cells.moveNext();
    }
}
