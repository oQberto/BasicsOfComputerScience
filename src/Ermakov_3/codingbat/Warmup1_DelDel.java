package Ermakov_3.codingbat;

public class Warmup1_DelDel {
    public static String delDel(String str) {
        if (str.length() >= 4 && str.startsWith("del", 1)) {
            return str.charAt(0) + str.substring(4);
        }
        return str;
    }
}
