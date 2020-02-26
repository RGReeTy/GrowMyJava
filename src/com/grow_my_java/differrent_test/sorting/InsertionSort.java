package com.grow_my_java.differrent_test.sorting;

// Java program for implementation of Insertion Sort

public class InsertionSort {
    /*Function to sort array using insertion sort*/

    /* A utility function to print array of size n*/
    static void printArray(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");

        System.out.println();
    }

    // Driver method
    public static void main(String args[]) {
        int arr[] = {12, 0, 16, 100, 100, 101, 100, 11, 13, 5, 6};

        InsertionSort ob = new InsertionSort();
        ob.sort(arr);

        printArray(arr);
    }

    void sort(int arr[]) {
        for (int i = 1; i < arr.length; i++) {
            int current = arr[i];
            int j = i - 1;

			/* Move elements of arr[0..i-1], that are
			greater than current, to one position ahead
			of their current position */
            while (j >= 0 && arr[j] > current) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = current;
        }
    }
}