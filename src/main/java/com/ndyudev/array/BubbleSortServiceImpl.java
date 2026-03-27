package com.ndyudev.array;

import java.util.Scanner;

public class BubbleSortServiceImpl implements BubbleSortService {
    /**
     *
     * @param arr
     * @param i
     * @param j
     */
    @Override
    public void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    @Override
    public int[] inputArray() {
        int length = 0;

        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập độ dài của mảng:");

        length = sc.nextInt();
        int[] arr = new int[length];
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("Nhập giá trị phần tử tại %s: ", i);
            arr[i] = sc.nextInt();
        }
        return arr;
    }

    /**
     *
     * @param arr
     * @return
     */
    @Override
    public int[] bubbleSort(int[] arr) {

        int length = arr.length;
        for (int i = 0; i < length - 1; i++) {
            for (int j = 0; j < length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    swap(arr, j, j + 1);
                }
            }
        }
        return arr;
    }
}
