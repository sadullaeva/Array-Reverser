package it.sevenbits.packages.array.Implementation;

import it.sevenbits.packages.array.IArray;

/**
 * Created by marina on 25.03.16.
 * Class for inverting of an integer array.
 * @param <T> type
 */
public final class Array<T> implements IArray<T> {

    private T[] array;

    /**
     * Default constructor
     */
    private Array() {
    }

    /**
     * Constructor
     * @param newArray new array
     */
    public Array(final T[] newArray) {
        array = newArray;
    }

    /**
     * Setter
     * @param newArray The integer array
     */
    public void setArray(final T[] newArray) {
        int length = newArray.length;
        System.arraycopy(newArray, 0, array, 0, length);
    }

    /**
     * Getter
     * @return array
     */
    public T[] getArray() {
        return array;
    }

}
