package commands;

import transform.Cells;

public class Print implements MainCommand{
    @Override
    public void runMethod(Cells cells) {
        cells.printValue();
    }
}
