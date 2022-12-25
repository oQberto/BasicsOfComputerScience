package Ermakov_3.codingbat;

public class Warmup1_mixStart {
    public static boolean mixStart(String str) {
        return str.length() > 2 && str.substring(0, 3).contains("ix");
    }
}
