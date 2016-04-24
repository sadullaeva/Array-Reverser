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
    public void testIntegerArrayPrinter() throws ArrayPrinterException {
        Integer[] ARRAY = new Integer[]{1, 2, 3};
        IArray<Integer> array = new Array<Integer>(ARRAY);
        ArrayPrinter arrayPrinter = new ArrayPrinter();
        arrayPrinter.printArray(array);
        assertEquals("1 2 3 \n", getOut());
    }

    @Test(expected = ArrayPrinterException.class)
    public void testNullPrinter() throws ArrayPrinterException {
        IArray<Object> array = new Array<Object>(null);
        ArrayPrinter arrayPrinter = new ArrayPrinter();
        arrayPrinter.printArray(array);
    }

    @Test
    public void testDoubleArrayPrinter() throws ArrayPrinterException {
        Double[] ARRAY = new Double[]{1.0, 2.5, 3.87};
        IArray<Double> array = new Array<Double>(ARRAY);
        ArrayPrinter arrayPrinter = new ArrayPrinter();
        arrayPrinter.printArray(array);
        assertEquals("1.0 2.5 3.87 \n", getOut());
    }

    @Test
    public void testStringArrayPrinter() throws ArrayPrinterException {
        String[] ARRAY = new String[]{"1.0", "2.5", "3.87"};
        IArray<String> array = new Array<String>(ARRAY);
        ArrayPrinter arrayPrinter = new ArrayPrinter();
        arrayPrinter.printArray(array);
        assertEquals("1.0 2.5 3.87 \n", getOut());
    }

    private String getOut() {
        return new String(out.toByteArray());
    }
}
