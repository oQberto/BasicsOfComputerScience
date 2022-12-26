package Ermakov_3.codingbat;

public class Warmup1_StartOz {
    public String startOz(String str) {
        if (str.equals("")) return str;
        if (str.startsWith("oz")) return "oz";
        if (str.charAt(0) == 'o') return "o";
        if (str.charAt(1) == 'z') return "z";
        return "";
    }
}
