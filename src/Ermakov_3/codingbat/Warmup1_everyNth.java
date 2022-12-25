package Ermakov_3.codingbat;

public class Warmup1_everyNth {
    public static String everyNth(String str, int n) {
        StringBuilder string = new StringBuilder(str.substring(0, 1));
        for (int i = 1; i < str.length(); i++) {
            if (i % n == 0) {
                string.append(str.charAt(i));
            }
        }
        return string.toString();
    }
}
