package it.sevenbits.packages.inverter.implementation;

/**
 * Created by marina on 21.04.16.
 * ArrayInverterException
 */
public class ArrayInverterException extends Exception {

    /**
     * ArrayInverterException default constructor
     * @param s error
     * @param e exception
     */
    ArrayInverterException(final String s, final Exception e) {
        super(s, e);
    }

}
