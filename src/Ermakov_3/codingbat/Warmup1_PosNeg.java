package Ermakov_3.codingbat;

public class Warmup1_PosNeg {
    public static boolean posNeg(int a, int b, boolean negative) {
        if (negative) {
            return (a < 0 && b < 0);
        }
        else {
            return ((a < 0 && b > 0) || (a > 0 && b < 0));
        }
    }

}
