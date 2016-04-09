package it.sevenbits.packages.array;

import it.sevenbits.packages.array.Implementation.Array;

/**
 * Created by marina on 09.04.16.
 * ArrayInverter interface
 * @param <T> type
 */
public interface IArrayInverter<T> {
    /**
     * Array inverter
     * @param array element of the Array class
     */
    void invertArray(Array<T> array);
}
