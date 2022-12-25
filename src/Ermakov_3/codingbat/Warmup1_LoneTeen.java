package Ermakov_3.codingbat;

public class Warmup1_LoneTeen {
    public static boolean loneTeen(int a, int b) {
        if ((a >= 13 && a <= 19) && (b >= 13 && b <= 19)) return false;
        return (a >= 13 && a <= 19) || (b >= 13 && b <= 19);
    }
}
