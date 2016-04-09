package it.sevenbits.packages.array;

/**
 * Created by marina on 03.04.16.
 * Interface for array
 * @param <T> type
 */

public interface IArray<T> {
    /**
     * Setter
     * @param array incoming arg
     */
    void setArray(final T[] array);

    /**
     * Getter
     * @return array
     */
    T[] getArray();

    /**
     * Inverter
     */
//    void invertTheArray();

}
