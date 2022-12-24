package Ermakov_2;

public class Ermakov_2_7 {
    public static void main(String[] args) {
        int integer = 10;
        double dub = 1.24;
        System.out.println("integer = " + integer + "\n" +
                            "double = " + dub + "\n");

        int sum1 = integer + (int) dub;
        int sum2 = (int) (integer + dub);
        double sum3 = integer + dub;
        System.out.println("sum1 = " + sum1 + "\n" +
                            "sum2 = " + sum2 + "\n" +
                            "sum3 = " + sum3 + "\n");

        int dif1 = integer - (int) dub;
        int dif2 = (int) (integer - dub);
        double dif3 = integer - dub;
        System.out.println("dif1 = " + dif1 + "\n" +
                            "dif2 = " + dif2 + "\n" +
                            "dif3 = " + dif3 + "\n");

        int prod1 = integer * (int) dub;
        int prod2 = (int) (integer * dub);
        double prod3 = integer * dub;
        System.out.println("prod1 = " + prod1 + "\n" +
                            "prod2 = " + prod2 + "\n" +
                            "prod3 = " + prod3 + "\n");

        int div1 = integer / (int) dub;
        int div2 = (int) (integer / dub);
        double div3 = integer / dub;
        System.out.println("div1 = " + div1 + "\n" +
                            "div2 = " + div2 + "\n" +
                            "div3 = " + div3 + "\n");
    }
}
/*
Разные результаты для одних и тех же лпераций получаются из-за преобразования типов
int div1 = integer / (int) dub - тут сначала у dub отбрасывается дробная часть, а потом происходит деление
то есть 10 / 1 = 10.
int div2 = (int) (integer / dub) - тут сразу происходит деление (за счет того, что в выражении есть тип double, Java
неявно преобразует int к double) 10.0 / 1.24 = 8.064516129032258, и только потом происходит преобразование double к int
(отбрасывается дробная часть).
 */