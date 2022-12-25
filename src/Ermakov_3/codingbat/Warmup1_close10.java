package Ermakov_3.codingbat;

public class Warmup1_close10 {
    public static int close10(int a, int b) {
        if (Math.abs(a - 10) == Math.abs(b - 10)) return 0;
        return Math.abs(a - 10) < Math.abs(b - 10) ? a : b;
    }
}
