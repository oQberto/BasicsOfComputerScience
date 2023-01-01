package Ermakov_5.Ermakov_5_11;

import java.util.Arrays;

public class Ermakov_5_11_5 {
    public static String printMaxValue(int[][] array) {
        return "Max element = " + maxValue(array) + ", max element index is " + Arrays.toString(indexOf(array, maxValue(array)));
    }

    public static String printMinValue(int[][] array) {
        return "Min element = " + minValue(array) + ", min element index is " + Arrays.toString(indexOf(array, minValue(array)));
    }

    private static int maxValue(int[][] array) {
        int max = Integer.MIN_VALUE;
        for (int[] ints : array) {
            for (int anInt : ints) {
                if (anInt > max) {
                    max = anInt;
                }
            }
        }
        return max;
    }

    private static int minValue(int[][] array) {
        int min = Integer.MAX_VALUE;
        for (int[] ints : array) {
            for (int anInt : ints) {
                if (anInt < min) {
                    min = anInt;
                }
            }
        }
        return min;
    }

    private static int[] indexOf(int[][] array, int element) {
        int[] indexOf = new int[2];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] == element) {
                    indexOf[0] = i;
                    indexOf[1] = j;
                }
            }
        }
        return indexOf;
    }
}
