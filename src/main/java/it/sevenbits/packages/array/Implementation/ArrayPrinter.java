package it.sevenbits.packages.array.Implementation;

import it.sevenbits.packages.array.IArrayPrinter;

/**
 * Created by marina on 09.04.16.
 * Displays the array
 * @param <T> type
 */
public class ArrayPrinter<T> implements IArrayPrinter<T> {

    /**
     * Array printer
     * @param array element of the Array class
     */
    public void printArray(final Array<T> array) {
        try {
            for (T element : array.getArray()) {
                System.out.print(element);
                System.out.print(' ');
            }
            System.out.print('\n');
        } catch (NullPointerException e) {
            System.out.print("Class ArrayPrinter: There was something unexpected.\n");
        }
    }
}
