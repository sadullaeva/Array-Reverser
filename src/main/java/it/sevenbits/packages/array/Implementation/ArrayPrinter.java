package it.sevenbits.packages.array.Implementation;

/**
 * Created by marina on 09.04.16.
 * Displays the array
 */
public class ArrayPrinter {
    private Array array;

    public void printArray(Array array) {
        for (Object element : array.getArray()) {
            System.out.print(element);
            System.out.print(' ');
        }
    }
}
