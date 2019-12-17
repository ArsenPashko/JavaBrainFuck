package transform;

public class Cells {

    private int dataPointer;
    private byte[] memory = new byte[30000];

    private static Cells instance;

    private Cells() {
    }

    public static Cells getInstance() {
        if (instance == null) {
            instance = new Cells();
        }
        return instance;
    }

    public byte getCurrentMemoryByte() {
        return memory[dataPointer];
    }

    public int getDataPointer() {
        return dataPointer;
    }

    public void moveNext() {
        dataPointer = (dataPointer == memory.length - 1) ? 0 : dataPointer + 1;
    }

    public void moveBack() {
        dataPointer = (dataPointer == 0) ? memory.length - 1 : dataPointer - 1;
    }

    public void printValue() {
        System.out.print((char) memory[dataPointer]);
    }

    public void increment() {
        ++memory[dataPointer];
    }

    public void decrement() {
        --memory[dataPointer];
    }
}
