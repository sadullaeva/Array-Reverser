package it.sevenbits.packages.array.Implementation;

import it.sevenbits.packages.array.IArrayPrinter;

/**
 * Created by marina on 09.04.16.
 * Displays the array
 */
public class ArrayPrinter implements IArrayPrinter {

    /**
     * Array printer
     * @param array element of the Array class
     */
    public void printArray(final Array array) {
        for (Object element : array.getArray()) {
            System.out.print(element);
            System.out.print(' ');
        }
        System.out.print('\n');
    }
}
