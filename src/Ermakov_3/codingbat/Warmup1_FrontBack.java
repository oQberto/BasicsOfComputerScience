package Ermakov_3.codingbat;

import java.util.Arrays;

public class Warmup1_FrontBack {
    public static String frontBack(String str) {
        if (str.length() <= 1) return str;
        return str.charAt(str.length() - 1) + str.substring(1, str.length() - 1) + str.charAt(0);
    }
}
