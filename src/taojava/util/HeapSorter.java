package taojava.util;

import java.util.Comparator;

/**
 * Sort using heap sort.
 */
public class HeapSorter {
    // +----------------+--------------------------------------------------
    // | Static Methods |
    // +----------------+

    /**
     * Sort an array.
     */
    public static <T> void sort(T[] values, Comparator<T> order) {
	for (int i = 0; i < values.length; i++) {
	    Heap.swapUp(values, i, order);
	} // for
	for (int j = values.length - 1; j >= 0; j--) {
	    Heap.swap(values, 0, j);
	    Heap.swapDown(values, j - 1, 0, order);
	} // for
    } // sort(T[], Comparator<T>)
} // class HeapSorter
