package Ermakov_5.Ermakov_5_11;

import com.sun.tools.javac.Main;

import java.util.Arrays;

public class Ermakov_5_11_8 {
    public static String twoSmallest(int[][] array) {
        Ermakov_5_11_6.sortFromMaxToMin(array);
        return "Two smallest numbers is:  " + array[array.length - 1][array.length] +
                ", " + array[array.length - 1][array.length - 1];
    }
}
