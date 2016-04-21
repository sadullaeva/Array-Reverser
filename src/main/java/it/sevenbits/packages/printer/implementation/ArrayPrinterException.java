package it.sevenbits.packages.printer.implementation;

/**
 * Created by marina on 21.04.16.
 * ArrayPrinterException
 */
public class ArrayPrinterException extends Exception {

    /**
     * ArrayPrinterException default constructor
     * @param s error
     * @param e exception
     */
    ArrayPrinterException(final String s, final Exception e) {
        super(s, e);
    }

}
