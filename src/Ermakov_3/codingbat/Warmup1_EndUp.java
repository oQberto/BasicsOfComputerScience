package Ermakov_3.codingbat;

public class Warmup1_EndUp {
    public static String endUp(String str) {
        return str.length() < 3 ? str.toUpperCase() : str.substring(0, str.length() - 3) + str.substring(str.length() - 3).toUpperCase();
    }
}
