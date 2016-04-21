package it.sevenbits.packages.bootstrap;

import it.sevenbits.packages.inverter.implementation.ArrayInverter;
import it.sevenbits.packages.inverter.implementation.ArrayInverterException;
import it.sevenbits.packages.printer.implementation.ArrayPrinter;
import it.sevenbits.packages.array.IArray;
import it.sevenbits.packages.array.implementation.Array;
import it.sevenbits.packages.printer.implementation.ArrayPrinterException;

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
     * @throws ArrayPrinterException exception
     * @throws ArrayInverterException exception
     */
    public static void main(final String[] args) throws ArrayPrinterException, ArrayInverterException {
        IArray<Integer> integerArray = new Array<Integer>(ARRAY);
        ArrayPrinter arrayPrinter = new ArrayPrinter();
        arrayPrinter.printArray(integerArray);
        ArrayInverter arrayInverter = new ArrayInverter();
        arrayInverter.invertArray(integerArray);
        arrayPrinter.printArray(integerArray);
    }

}
