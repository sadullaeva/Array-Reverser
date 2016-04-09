package it.sevenbits.packages.array.Implementation;

import it.sevenbits.packages.array.IArrayClass;

/**
 * Created by marina on 25.03.16.
 * Class for inverting of an integer array.
 * @param <T> type
 */
public final class ArrayClass<T> implements IArrayClass<T> {

    private T[] array;

    /**
     * Default constructor
     */
    private ArrayClass() {
    }

    /**
     * Constructor
     * @param newArray new array
     */
    public ArrayClass(final T[] newArray) {
        array = newArray;
    }

    /**
     * This method displays the integer array.
     */
    public void printArray() {
        for (T element : this.array) {
            System.out.print(element);
            System.out.print(' ');
        }
        System.out.print('\n');
    }

    /**
     * Invert Array
     */
    public void invertTheArray() {
        int length = array.length;
        for (int index = 0; index < length / 2; index++) {
            T temp = this.array[index];
            this.array[index] = this.array[length - index - 1];
            this.array[length - index - 1] = temp;
        }
    }

    /**
     * Setter
     * @param newArray The integer array
     */
    public void setArray(final T[] newArray) {
        int length = newArray.length;
        if (array.length == length) {
            System.arraycopy(newArray, 0, array, 0, length);
        }
    }

    /**
     * Getter
     * @return array
     */
    public T[] getArray() {
        return array;
    }

}
