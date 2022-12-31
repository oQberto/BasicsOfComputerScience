package Ermakov_5;

public class Ermakov_5_9 {
    public static String method(int[] array) {
        int temp = 0, max = 1;
        for (int k : array) {
            int count = 0;
            for (int i : array) {
                count += k == i ? 1 : 0;
                if (count > max) {
                    temp = k;
                    max = count;
                }
            }
            if (count == max) {
                temp = Math.max(temp, k);
            }
        }
        return String.valueOf(temp);
    }
}
