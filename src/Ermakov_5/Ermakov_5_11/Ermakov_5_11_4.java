package Ermakov_5.Ermakov_5_11;

public class Ermakov_5_11_4 {
    public static int arraySum(int[][] array) {
        int sum = 0;
        for (int[] ints : array) {
            for (int anInt : ints) {
                sum += anInt;
            }
        }
        return sum;
    }
}
