package com.ndyudev.array;

public interface BubbleSortService {
    /**
     *
     * @param arr
     * @param i
     * @param j
     */
    void swap(int[] arr, int i, int j);

    /**
     *
     * @return
     */
    int[] inputArray();

    /**
     *
     * @param arr
     * @return
     */
    int[] bubbleSort(int[] arr);
}
