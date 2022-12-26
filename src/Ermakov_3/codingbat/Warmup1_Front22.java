package Ermakov_3.codingbat;

public class Warmup1_Front22 {
    public static String front22(String str) {
        return str.length() < 2 ? str + str + str : str.substring(0,2) + str + str.substring(0, 2);
    }
}
