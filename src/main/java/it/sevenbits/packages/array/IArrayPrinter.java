package it.sevenbits.packages.array;

import it.sevenbits.packages.array.Implementation.Array;

/**
 * Created by marina on 09.04.16.
 * ArrayPrinter interface
 * @param <T> type
 */
public interface IArrayPrinter<T> {
    /**
     * Array printer
     * @param array element of the Array class
     */
    void printArray(final Array<T> array);
}
