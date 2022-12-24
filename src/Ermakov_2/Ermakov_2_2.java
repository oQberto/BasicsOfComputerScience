package Ermakov_2;

public class Ermakov_2_2 {
    public static void main(String[] args) {
        byte byteVar = 10;
        short shortVar = byteVar;
        int intVar = byteVar;
        long longVar = byteVar;
        double doubleVar = byteVar;
        float floatVar = byteVar;

        System.out.println("byte = " + byteVar + "\n" +
                            "short = " + shortVar + "\n" +
                            "int = " + intVar + "\n" +
                            "long = " + longVar + "\n" +
                            "double = " + doubleVar + "\n" +
                            "float = " + floatVar + "\n");
    }
}
 /*
 Для типа float вывелось значение 10.0 т.к. float предусматривает
 хранение не только целой части, но и дробной.
  */