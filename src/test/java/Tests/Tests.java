package Tests;

import static junit.framework.Assert.assertEquals;
import org.junit.Test;
import transform.Cells;

public class Tests {
    private Cells cellsTest = Cells.getInstance();

    @Test
    public void testNextPreviousCells(){
        cellsTest.moveNext();
        cellsTest.moveNext();
        cellsTest.moveNext();
        cellsTest.moveBack();

        assertEquals(2,cellsTest.getDataPointer() );
    }

    @Test
    public void testIncrDecr(){
        cellsTest.increment();
        cellsTest.increment();
        cellsTest.decrement();

        assertEquals(1, cellsTest.getCurrentMemoryByte());
    }
}
