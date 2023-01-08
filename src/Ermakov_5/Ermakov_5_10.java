package Ermakov_5;

public class Ermakov_5_10 {
    public int[][] doTwoDimensionalArray(int length, int width) {
        int[][] defaultArray = new int[length][width];
        for (int i = 0; i < defaultArray.length; i++) {
            for (int j = 0; j < defaultArray[i].length; j++) {
                defaultArray[i][j] = (int) (Math.random() * 100);
            }
        }
        return defaultArray;
    }
}
