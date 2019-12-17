package commands;

import transform.Cells;

public class PreviousCell implements MainCommand {
    @Override
    public void runMethod(Cells cells) {
        cells.moveBack();
    }
}
