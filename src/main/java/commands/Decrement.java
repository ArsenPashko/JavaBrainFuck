package commands;

import transform.Cells;


public class Decrement implements MainCommand {
    public void runMethod(Cells cells){cells.decrement();}
}
