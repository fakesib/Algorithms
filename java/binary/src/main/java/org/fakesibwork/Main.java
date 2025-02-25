package org.fakesibwork;

public class Main {
    public static void main(String[] args) {
        int[] array = {1, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13};

        System.out.println(binarySearch(array, 3));

    }

    static int binarySearch(int[] list, int item){
        int low = 0;
        int high = list.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;
            int guess = list[mid];
            if (guess == item) {
                return guess;
            } if (guess >= item) {
                high = mid - 1;
            } else {
                low = mid - 1;
            }
        }
        return 0;
    }
}