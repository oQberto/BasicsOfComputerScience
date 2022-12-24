package Ermakov_2;

public class Ermakov_2_3 {
    public static void main(String[] args) {
        long longVar = 1_000_000_000L;
        byte byteVar = (byte) longVar;
        short shortVar = (short) longVar;
        int intVar = (int) longVar;
        double doubleVar = longVar;
        float floatVar = longVar;

        System.out.println("byte = " + byteVar + "\n" +
                            "short = " + shortVar + "\n" +
                            "int = " + intVar + "\n" +
                            "long = " + longVar + "\n" +
                            "double = " + doubleVar + "\n" +
                            "float = " + floatVar + "\n");
    }
}
/*
int == long т.к. тип int может вместить в себя 1_000_000_000 без потери данных.
short != long т.к. shotMax == 32_767, следовательно произошла потеря данных.
 */