package Ermakov_5;

public class Ermakov_5_1 {
    public int[] makeArray() {
        int[] defaultArray = new int[9];
        for (int i = 0; i < defaultArray.length; i++) {
            defaultArray[i] = (int) (Math.random() * 10);
        }
        return defaultArray;
    }
}