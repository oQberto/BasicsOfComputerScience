package Ermakov_3.codingbat;

public class Warmup1_Front3 {
    public static String front3(String str) {
        return str.length() < 3 ? str + str + str : str.substring(0, 3) + str.substring(0, 3) + str.substring(0, 3);
    }
}
