package it.sevenbits.packages.printer;

import it.sevenbits.packages.array.IArray;
import it.sevenbits.packages.printer.implementation.ArrayPrinterException;

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
    <T> void printArray(final IArray<T> array) throws ArrayPrinterException;
}