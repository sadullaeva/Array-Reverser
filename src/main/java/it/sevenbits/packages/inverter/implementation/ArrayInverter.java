package it.sevenbits.packages.inverter.implementation;

import it.sevenbits.packages.array.IArray;
import it.sevenbits.packages.inverter.IArrayInverter;

/**
 * Created by marina on 09.04.16.
 * Invert the array
 */
public class ArrayInverter implements IArrayInverter {
    /**
     * Array inverter
     * @param array element of the Array class
     * @param <T> type
     * @throws ArrayInverterException exception
     */
    public <T> void invertArray(final IArray<T> array) throws ArrayInverterException {
        try {
            T[] tempArray = array.getArray();
            int length = tempArray.length;

            for (int index = 0; index < length / 2; index++) {
                T temp = tempArray[index];
                tempArray[index] = tempArray[length - index - 1];
                tempArray[length - index - 1] = temp;
            }
            array.setArray(tempArray);
        } catch (NullPointerException npe) {
            throw new ArrayInverterException("Input parameter is null", npe);
        }
    }

}
