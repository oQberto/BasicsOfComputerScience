import Ermakov_5.Ermakov_5_1;
import Ermakov_5.Ermakov_5_10;
import Ermakov_5.Ermakov_5_11.Ermakov_5_11_6;

import java.util.Arrays;

public class Main {
    private final static Ermakov_5_1 ermakov_5_1 = new Ermakov_5_1();
    private final static Ermakov_5_10 ermakov_5_10 = new Ermakov_5_10();
    private final static int[] testArray = ermakov_5_1.doArray();
    private final static int[][] testArray2 = ermakov_5_10.doTwoDimensionalArray();
    public static void main(String[] args) {
        printTwoDimensionalArray(testArray2);
        System.out.println();
        printTwoDimensionalArray(Ermakov_5_11_6.sortFromMaxToMin(testArray2));
    }

    private static void printTwoDimensionalArray(int[][] array) {
        for (int[] ints : array) {
            for (int anInt : ints) {
                System.out.print(anInt + " ");
            }
            System.out.println();
        }
    }
}