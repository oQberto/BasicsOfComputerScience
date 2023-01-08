import Ermakov_5.Ermakov_5_1;
import Ermakov_5.Ermakov_5_10;
import Ermakov_6.Ermakov_6_3;

import java.util.Arrays;

public class Main {
    private final static Ermakov_5_1 ermakov_5_1 = new Ermakov_5_1();
    private final static Ermakov_5_10 ermakov_5_10 = new Ermakov_5_10();
    private final static int[] testArray = ermakov_5_1.doArray();
    private final static int[][] testArray2 = ermakov_5_10.doTwoDimensionalArray(4, 5);
    public static void main(String[] args) {
        System.out.println(Arrays.toString(testArray));
        Ermakov_6_3.bubbleSort(testArray);
        System.out.println();
        System.out.println(Arrays.toString(testArray));
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