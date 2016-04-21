package it.sevenbits.packages.printer;

import it.sevenbits.packages.array.IArray;
import it.sevenbits.packages.array.implementation.Array;
import it.sevenbits.packages.printer.implementation.ArrayPrinter;
import it.sevenbits.packages.printer.implementation.ArrayPrinterException;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;

public class ArrayPrinterTest {

    private ByteArrayOutputStream out;

    @Before
    public void SetUp() {
        out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
    }

    @Test
    public void testArrayPrinter() throws ArrayPrinterException {
        Integer[] ARRAY = new Integer[]{1, 2, 3};
        IArray<Integer> array = new Array<Integer>(ARRAY);
        ArrayPrinter arrayPrinter = new ArrayPrinter();
        arrayPrinter.printArray(array);
        assertEquals("1 2 3 \n", getOut());
    }

    private String getOut() {
        return new String(out.toByteArray());
    }
}
