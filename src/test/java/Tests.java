import org.junit.jupiter.api.Test;
import transform.Cells;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Tests {
    private Cells cellsTest = Cells.getInstance();

    @Test
    void testNextPreviousCells(){
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
