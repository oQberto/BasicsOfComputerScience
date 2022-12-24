package Ermakov_3.codingbat;

public class Warmup1_SleepIn {
    public static boolean sleepIn(boolean weekday, boolean vacation) {
        if (weekday && !vacation) {
            return false;
        } else if (!weekday && vacation) {
            return true;
        }
        return true;
    }
}
