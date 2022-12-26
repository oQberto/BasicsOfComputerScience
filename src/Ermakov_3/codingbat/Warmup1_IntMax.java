package Ermakov_3.codingbat;

public class Warmup1_IntMax {
    public static int intMax(int a, int b, int c) {
        if (a > b && a > c) return a;
        if (b > a && b > c) return b;
        return c;
    }
}
