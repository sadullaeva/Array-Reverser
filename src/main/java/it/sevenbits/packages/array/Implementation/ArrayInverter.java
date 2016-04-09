package it.sevenbits.packages.array.Implementation;

import it.sevenbits.packages.array.IArrayInverter;

/**
 * Created by marina on 09.04.16.
 * Invert the array
 * @param <T> type
 */
public class ArrayInverter<T> implements IArrayInverter<T> {
    /**
     * Array inverter
     * @param array element of the Array class
     */
    public void invertArray(final Array<T> array) {
        T[] tempArray = array.getArray();
        int length = tempArray.length;

        for (int index = 0; index < length / 2; index++) {
            T temp = tempArray[index];
            tempArray[index] = tempArray[length - index - 1];
            tempArray[length - index - 1] = temp;
        }
        array.setArray(tempArray);
    }

}
