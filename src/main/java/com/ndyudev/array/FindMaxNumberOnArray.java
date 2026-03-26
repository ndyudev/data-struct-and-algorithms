package com.ndyudev.array;

import java.util.Arrays;
import java.util.Scanner;

public class FindMaxNumberOnArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Nhập độ dài của mảng:");
        int length = sc.nextInt();
        double[] arr = new double[length];

        for ( int i = 0; i < arr.length;) {
            System.out.println("Nhập giá trị phần tử:");
            double number = sc.nextDouble();
            arr[i] = number;
            i++;
        }
        findMaxNumberOnArray(arr);
    }

    public static void findMaxNumberOnArray(double[] arr) {
        double result = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(result < arr[i]) {
                result = arr[i];
            }
        }
        System.out.println("Giá trị lớn nhất mảng là:" + result);
    }
}
