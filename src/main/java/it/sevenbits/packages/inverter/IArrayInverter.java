package it.sevenbits.packages.inverter;

import it.sevenbits.packages.array.IArray;
import it.sevenbits.packages.inverter.implementation.ArrayInverterException;

/**
 * Created by marina on 09.04.16.
 * ArrayInverter interface
 */
public interface IArrayInverter {
    /**
     * Array inverter
     * @param array element of the Array class
     * @param <T> type
     */
    <T> void invertArray(IArray<T> array) throws ArrayInverterException;
}
