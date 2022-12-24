package Ermakov_2;

public class Ermakov_2_4 {
    public static void main(String[] args) {

        double doubleVar = 1.234567891234567;
        byte byteVar = (byte) doubleVar;
        short shortVar = (short) doubleVar;
        int intVar = (int) doubleVar;
        long longVar = (long) doubleVar;
        float floatVar = (float) doubleVar;

        System.out.println("byte = " + byteVar + "\n" +
                            "short = " + shortVar + "\n" +
                            "int = " + intVar + "\n" +
                            "long = " + longVar + "\n" +
                            "double = " + doubleVar + "\n" +
                            "float = " + floatVar + "\n");
    }
}
/*
Для целочисленных типов значение стало равно 1, т.к. вся дробная часть (без округления)
отбрасывается.
float "обрезало" т.к. в памяти этот тип занимает 32 бита, в отличае от double занимающего 64 бита.
У типа float зарезервированно меньше знаков для хранения дроюной части, следовательно все, что
выходит за этот предел, просто "обрезается".
 */
