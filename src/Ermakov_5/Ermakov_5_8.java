package Ermakov_5;

import java.util.Arrays;

public class Ermakov_5_8 {
    public static String twoSmallest(int[] array) {
        Arrays.sort(array);
        return "The smallest nums: " + array[0] + ", " + array[1];
    }
}
