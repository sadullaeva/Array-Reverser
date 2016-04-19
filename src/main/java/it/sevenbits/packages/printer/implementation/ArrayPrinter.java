package it.sevenbits.packages.printer.implementation;

import it.sevenbits.packages.array.IArray;
import it.sevenbits.packages.printer.IArrayPrinter;

/**
 * Created by marina on 09.04.16.
 * Displays the array
 */
public class ArrayPrinter implements IArrayPrinter {

    /**
     * Array printer
     * @param array element of the Array class
     * @param <T> type
     * @throws NullPointerException exception
     */
    public <T> void printArray(final IArray<T> array) throws NullPointerException {
        for (T element : array.getArray()) {
            System.out.print(element);
            System.out.print(' ');
        }
        System.out.print('\n');
    }
}
