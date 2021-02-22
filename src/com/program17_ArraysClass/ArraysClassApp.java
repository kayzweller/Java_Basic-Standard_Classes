package com.program17_ArraysClass;

import java.util.Arrays;

public class ArraysClassApp {
  public static void main(String[] args) {

    int[] numbers = {
        1, 0, 2, 9, 3, 8, 4, 7, 5, 6, 13, 99, 100, 12, 28, 34
    };

    Arrays.sort(numbers);

    System.out.println(Arrays.toString(numbers));
    System.out.println("index: " + Arrays.binarySearch(numbers, 13));
    System.out.println("index: " + Arrays.binarySearch(numbers, 28));
    System.out.println("index: " + Arrays.binarySearch(numbers, 73));

    int[] result1 = Arrays.copyOf(numbers, 7);
    System.out.println(Arrays.toString(result1));

    int[] result2 = Arrays.copyOfRange(numbers, 3, 11);
    System.out.println(Arrays.toString(result2));

  }
}
