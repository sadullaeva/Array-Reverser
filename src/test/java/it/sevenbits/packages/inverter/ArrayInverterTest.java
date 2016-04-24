package it.sevenbits.packages.inverter;

import it.sevenbits.packages.array.IArray;
import it.sevenbits.packages.array.implementation.Array;
import it.sevenbits.packages.inverter.implementation.ArrayInverter;
import it.sevenbits.packages.inverter.implementation.ArrayInverterException;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

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
        assertEquals(INVERTING_ARRAY, integerArray.getArray());
    }

    @Test(expected = ArrayInverterException.class)
    public void testNullInverter() throws ArrayInverterException {
        IArray<Integer> integerArray = new Array<Integer>(null);
        ArrayInverter arrayInverter = new ArrayInverter();
        arrayInverter.invertArray(integerArray);
    }
}
