package Ermakov_5.Ermakov_5_11;

import Ermakov_5.Ermakov_5_6;

public class Ermakov_5_11_6 {
    public static int[][] sortFromMaxToMin(int[][] array) {
        return convert1dTo2d(array, convert2dTo1d(array));
    }

    public static int[] convert2dTo1d(int[][] array) {
        int[] intermediateArray = new int[20];
        int temp = 0;
        for (int[] ints : array) {
            for (int anInt : ints) {
                intermediateArray[temp] = anInt;
                temp++;
            }
        }
        Ermakov_5_6.sortFromMaxToMin(intermediateArray);
        return intermediateArray;
    }

    private static int[][] convert1dTo2d(int[][] array, int[] intermediateArray) {
        int temp1 = -1;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                temp1++;
                array[i][j] = intermediateArray[temp1];
            }
        }
        return array;
    }
}