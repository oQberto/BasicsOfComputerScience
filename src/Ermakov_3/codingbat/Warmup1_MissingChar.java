package Ermakov_3.codingbat;

public class Warmup1_MissingChar {
    public static String missingChar(String str, int n) {
        return str.substring(0, n) + str.substring(n + 1);
    }
}
