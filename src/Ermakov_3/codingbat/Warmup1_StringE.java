package Ermakov_3.codingbat;

public class Warmup1_StringE {
    public static boolean stringE(String str) {
        byte count = 0;
        for (char element : str.toCharArray()) {
            if (element == 'e') count++;
        }
        return count <= 3 && count >= 1;
    }
}
