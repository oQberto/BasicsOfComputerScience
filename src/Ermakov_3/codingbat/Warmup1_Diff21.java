package Ermakov_3.codingbat;

public class Warmup1_Diff21 {
    public static int diff21(int n) {
        if (n < 21) return 21 - n;
        return Math.abs((21 - n) * 2);
    }
}
