package Ermakov_3.codingbat;

public class Warmup1_ParrotTrouble {
    public static boolean parrotTrouble(boolean talking, int hour) {
        return (talking && (hour < 7 || hour > 20));
    }
}
