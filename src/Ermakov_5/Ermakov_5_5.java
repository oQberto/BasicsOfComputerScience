package Ermakov_5;


public class Ermakov_5_5 {
    public static String printMaxMin(int[] array) {
        return "Max element = " + findMax(array) + ", index of max element = " + indexOf(array, findMax(array)) + "\n" +
                "Min element = " + findMin(array) + ", index of min element = " + indexOf(array, findMin(array));
    }

    private static int findMax(int[] array) {
        int max = Integer.MIN_VALUE;
        for (int j : array) {
            if (j > max) {
                max = j;
            }
        }
        return max;
    }

    private static int findMin(int[] array) {
        int min = Integer.MAX_VALUE;
        for (int j : array) {
            if (j < min) {
                min = j;
            }
        }
        return min;
    }

    private static int indexOf(int[] array, int num) {
        int index = -1;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == num) {
                index = i;
            }
        }
        return index;
    }
}
