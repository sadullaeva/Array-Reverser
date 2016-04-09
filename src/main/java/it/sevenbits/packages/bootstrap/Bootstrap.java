package it.sevenbits.packages.bootstrap;

import it.sevenbits.packages.array.IArrayClass;
import it.sevenbits.packages.array.Implementation.ArrayClass;

/**
 * Created by marina on 25.03.16.
 * Main class.
 */
public final class Bootstrap {

    private static final Integer[] ARRAY = new Integer[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11};

    private Bootstrap() {
    }

    /**
     * Main method.
     * @param args - just like that
     */
    public static void main(final String[] args) {

        IArrayClass<Integer> integerArray = new ArrayClass<Integer>(ARRAY);
        integerArray.printArray();
        integerArray.invertTheArray();
        integerArray.printArray();

    }

}
