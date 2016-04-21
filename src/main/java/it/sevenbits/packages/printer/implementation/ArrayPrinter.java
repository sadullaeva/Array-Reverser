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
     * @throws ArrayPrinterException exception
     */
    public <T> void printArray(final IArray<T> array) throws ArrayPrinterException {
        try {
            for (T element : array.getArray()) {
                System.out.print(element);
                System.out.print(' ');
            }
            System.out.print('\n');
        } catch (NullPointerException npe) {
            throw new ArrayPrinterException("Input parameter is null", npe);
        }
    }
}
