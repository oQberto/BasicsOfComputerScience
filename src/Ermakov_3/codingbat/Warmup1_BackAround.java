package Ermakov_3.codingbat;

public class Warmup1_BackAround {
    public static String backAround(String str) {
        return str.substring(str.length() - 1) + str + str.substring(str.length() - 1);
    }
}
