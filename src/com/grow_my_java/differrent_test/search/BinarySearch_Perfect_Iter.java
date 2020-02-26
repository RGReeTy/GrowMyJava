package com.grow_my_java.differrent_test.search;

public class BinarySearch_Perfect_Iter {
    static int BinarySearch_Iter(int[] array, boolean descendingOrder, int key) {
        int left = 0;
        int right = array.length;
        int mid = 0;

        while (!(left >= right)) {
            mid = left + (right - left) / 2;

            if (array[left] == key)
                return left;

            if (array[mid] == key) {
                if (mid == left + 1)
                    return mid;
                else
                    right = mid + 1;
            } else if ((array[mid] > key) ^ descendingOrder)
                right = mid;
            else
                left = mid + 1;
        }

        return -(1 + left);
    }

    static int BinarySearch_Iter_Wrapper(int[] array, int key) {
        if (array.length == 0)
            return -1;

        boolean descendingOrder = array[0] > array[array.length - 1];
        return BinarySearch_Iter(array, descendingOrder, key);
    }
}
