package Ermakov_3.codingbat;

public class Warmup1_NotString {
    public static String notString(String str) {
        return str.startsWith("not") ? str : "not " + str;
    }
}
