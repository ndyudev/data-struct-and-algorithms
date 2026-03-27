package com.ndyudev.array;

public class BubbleSortMain {
    public static void main(String[] args) {
        BubbleSortServiceImpl bubbleSortService = new BubbleSortServiceImpl();

        int[] arr = bubbleSortService.inputArray();

        arr = bubbleSortService.bubbleSort(arr);

        for (int number : arr) {
            System.out.println(number);
        }
    }
}
