package Ermakov_4;

import java.util.ArrayList;
import java.util.Arrays;

public class Ermakov_4_9 {
    static String[] array1 = null;
    static String[] array2 = null;
    public static ArrayList<String> vampiresNumber() {
        ArrayList<String> methodOutPut = new ArrayList<>();
        for (int i = 10; i < 100; i++) {
            for (int j = i + 1; j < 100; j++) {
                int desiredNum = i * j;
                if (desiredNum < 1000) {
                    continue;
                }

                array1 = makeArray(desiredNum);
                array2 = makeArray(i, j);
                Arrays.sort(array1);
                Arrays.sort(array2);

                if (Arrays.equals(array1, array2)) {
                    methodOutPut.add(String.valueOf(desiredNum));
                }
            }
        }
        return methodOutPut;
    }

    private static String[] makeArray(int arrayContent) {
        return String.valueOf(arrayContent).split("");
    }

    private static String[] makeArray(int factor1, int factor2) {
        return (String.valueOf(factor1) + factor2).split("");
    }
}
