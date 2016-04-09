package it.sevenbits.packages.array;

import it.sevenbits.packages.array.Implementation.Array;

/**
 * Created by marina on 09.04.16.
 * ArrayPrinter interface
 */
public interface IArrayPrinter {
    /**
     * Array printer
     * @param array element of the Array class
     * @param <T> type
     */
    <T> void printArray(final Array<T> array);
}
