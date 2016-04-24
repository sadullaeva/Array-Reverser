package it.sevenbits.packages.inverter;

import it.sevenbits.packages.array.IArray;
import it.sevenbits.packages.array.implementation.Array;
import it.sevenbits.packages.inverter.implementation.ArrayInverter;
import it.sevenbits.packages.inverter.implementation.ArrayInverterException;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class ArrayInverterTest {

    @Before
    public void SetUp() {

    }

    @Test
    public void testIntegerArrayInverter() throws ArrayInverterException {
        Integer[] ARRAY = new Integer[]{1, 2, 3};
        IArray<Integer> integerArray = new Array<Integer>(ARRAY);
        Integer[] INVERTING_ARRAY = new Integer[]{3, 2, 1};
        ArrayInverter arrayInverter = new ArrayInverter();
        arrayInverter.invertArray(integerArray);
        assertArrayEquals(INVERTING_ARRAY, integerArray.getArray());
    }

    @Test(expected = ArrayInverterException.class)
    public void testNullInverter() throws ArrayInverterException {
        IArray<Integer> integerArray = new Array<Integer>(null);
        ArrayInverter arrayInverter = new ArrayInverter();
        arrayInverter.invertArray(integerArray);
    }

    @Test
    public void testDoubleArrayInverter() throws ArrayInverterException {
        Double[] ARRAY = new Double[]{1.0, 2.5, 3.87};
        IArray<Double> doubleArray = new Array<Double>(ARRAY);
        Double[] INVERTING_ARRAY = new Double[]{3.87, 2.5, 1.0};
        ArrayInverter arrayInverter = new ArrayInverter();
        arrayInverter.invertArray(doubleArray);
        assertArrayEquals(INVERTING_ARRAY, doubleArray.getArray());
    }

    @Test
    public void testStringArrayInverter() throws ArrayInverterException {
        String[] ARRAY = new String[]{"1.0", "2.5", "3.87"};
        IArray<String> stringArray = new Array<String>(ARRAY);
        String[] INVERTING_ARRAY = new String[]{"3.87", "2.5", "1.0"};
        ArrayInverter arrayInverter = new ArrayInverter();
        arrayInverter.invertArray(stringArray);
        assertArrayEquals(INVERTING_ARRAY, stringArray.getArray());
    }

}
