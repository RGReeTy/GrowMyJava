package com.grow_my_java.differrent_test.search;

public class BinarySearch_Perfect_Recurs {

    static int BinarySearch_Rec(int[] array, boolean descendingOrder, int key, int left, int right) {
        int mid = left + (right - left) / 2;

        if (left >= right)
            return -(1 + left);

        if (array[left] == key)
            return left;

        if (array[mid] == key) {
            if (mid == left + 1)
                return mid;
            else
                return BinarySearch_Rec(array, descendingOrder, key, left, mid + 1);
        } else if ((array[mid] > key) ^ descendingOrder)
            return BinarySearch_Rec(array, descendingOrder, key, left, mid);
        else
            return BinarySearch_Rec(array, descendingOrder, key, mid + 1, right);
    }

    static int BinarySearch_Rec_Wrapper(int[] array, int key) {
        if (array.length == 0)
            return -1;

        boolean descendingOrder = array[0] > array[array.length - 1];
        return BinarySearch_Rec(array, descendingOrder, key, 0, array.length);
    }
}
