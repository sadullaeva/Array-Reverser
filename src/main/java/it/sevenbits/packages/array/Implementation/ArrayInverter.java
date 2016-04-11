package it.sevenbits.packages.array.Implementation;

import it.sevenbits.packages.array.IArray;
import it.sevenbits.packages.array.IArrayInverter;

/**
 * Created by marina on 09.04.16.
 * Invert the array
 */
public class ArrayInverter implements IArrayInverter {
    /**
     * Array inverter
     * @param array element of the Array class
     * @param <T> type
     */
    public <T> void invertArray(final IArray<T> array) {
        try {
            T[] tempArray = array.getArray();
            int length = tempArray.length;

            for (int index = 0; index < length / 2; index++) {
                T temp = tempArray[index];
                tempArray[index] = tempArray[length - index - 1];
                tempArray[length - index - 1] = temp;
            }
            array.setArray(tempArray);
        } catch (NullPointerException e) {
            System.out.print("Class ArrayInverter: There was something unexpected.\n");
        }
    }

}
