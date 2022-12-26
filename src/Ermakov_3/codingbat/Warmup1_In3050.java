package Ermakov_3.codingbat;

public class Warmup1_In3050 {
    public static boolean in3050(int a, int b) {
        boolean between3040 = (a >= 30 && a <= 40) && (b >= 30 && b <= 40);
        boolean between4050 = (a >= 40 && a <= 50) && (b >= 40 && b <= 50);
        return between3040 || between4050;
    }
}
