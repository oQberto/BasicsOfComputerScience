package Ermakov_5;

public class Ermakov_5_7 {
    public static StringBuilder lessThanAverage(int[] array) {
        StringBuilder stringBuilder = new StringBuilder();
        int arrayAverage = Ermakov_5_4.arrayElementsSum(array) / array.length;

        for (int element : array) {
            if (element < arrayAverage) {
                stringBuilder.append(element).append(" ");
            }
        }
        return stringBuilder;
    }
}
