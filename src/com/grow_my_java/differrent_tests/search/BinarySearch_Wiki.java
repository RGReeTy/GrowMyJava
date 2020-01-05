package com.grow_my_java.differrent_tests.search;

public class BinarySearch_Wiki {

    private double[] array;

    public BinarySearch_Wiki(double[] array) {
        this.array = array;
    }

    public static void main(String[] args) {
        // тесты (необходимо включить опцию -enableassertions)
        BinarySearch_Wiki bs = new BinarySearch_Wiki(null);
        assert bs.find(7) == -1;
        bs = new BinarySearch_Wiki(new double[0]);
        assert bs.find(7) == -1;
        bs = new BinarySearch_Wiki(new double[]{7});
        assert bs.find(7) == 0;
        assert bs.find(20) == -1;
        bs = new BinarySearch_Wiki(new double[]{7, 20});
        assert bs.find(-30) == -1;
        assert bs.find(7) == 0;
        assert bs.find(12) == -1;
        assert bs.find(20) == 1;
        assert bs.find(30) == -1;
        bs = new BinarySearch_Wiki(new double[]{-16, -9, -5, 0, 3, 7, 12, 18, 20, 24, 30, 32, 38, 47, 50});
        assert bs.find(-30) == -1;
        assert bs.find(-16) == 0;
        assert bs.find(7) == 5;
        assert bs.find(20) == 8;
        assert bs.find(24) == 9;
        assert bs.find(40) == -1;
        assert bs.find(50) == 14;
        assert bs.find(60) == -1;
    }

    // собственно алгоритм поиска
    public int find(double x) {
        int i = -1;
        if (this.array != null) {
            int low = 0, high = this.array.length, mid;
            while (low < high) {
                mid = (low + high) >>> 1;
                if (x == this.array[mid]) {
                    i = mid;
                    break;
                } else {
                    if (x < this.array[mid]) {
                        high = mid;
                    } else {
                        low = mid + 1;
                    }
                }
            }
        }
        return i;
    }
}

