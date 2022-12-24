package Ermakov_3.codingbat;

public class Warmup1_NearHundred {
    public static boolean nearHundred(int n) {
        return Math.abs(n - 100) <= 10 || Math.abs(n - 200) <= 10;
    }
}
