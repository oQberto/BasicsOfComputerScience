package Ermakov_3.codingbat;

public class Warmup1_Diff21 {
    public static int diff21(int n) {
        return n < 21 ? 21 - n : Math.abs((21 - n) * 2);
    }
}
