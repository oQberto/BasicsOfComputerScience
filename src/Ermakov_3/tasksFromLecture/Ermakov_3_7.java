package Ermakov_3.tasksFromLecture;

import java.util.Calendar;

public class Ermakov_3_7 {
    public static int time(int n) {
        Calendar calendar = Calendar.getInstance();
        return (calendar.get(Calendar.MINUTE) % 10) * n;
    }
}
