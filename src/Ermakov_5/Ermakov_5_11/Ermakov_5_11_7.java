package Ermakov_5.Ermakov_5_11;

public class Ermakov_5_11_7 {
    public static StringBuilder lessThanAverage(int[][] array) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int[] ints : array) {
            for (int anInts : ints) {
                if (anInts < averageOf2dArray(array)) {
                    stringBuilder.append(anInts).append(" ");
                }
            }
        }
        return stringBuilder;
    }

    private static int averageOf2dArray(int[][] array) {
        return Ermakov_5_11_4.arraySum(array) / 20;
    }
}
