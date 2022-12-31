import Ermakov_5.Ermakov_5_1;
import Ermakov_5.Ermakov_5_3;

import java.util.Arrays;

public class Main {
    private final static Ermakov_5_1 ermakov_5_1 = new Ermakov_5_1();
    private final static int[] testArray = ermakov_5_1.makeArray();
    public static void main(String[] args) {
        System.out.println(Arrays.toString(testArray));
        System.out.println(Ermakov_5_3.printEvenElements(testArray));
    }
}