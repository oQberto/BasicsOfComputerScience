package Ermakov_3.tasksFromLecture;

public class Ermakov_3_10 {
    public static String cubicEquation(int A, int B, int C, int D) {
        double a = (double) B / A;
        double b = (double) C / A;
        double c = (double) D / A;

        double p = b - (Math.pow(a, 2) / 3);
        double q = ((2 * Math.pow(a, 3)) / 27) - ((a * b) / 3) + c;

        double discriminant = (Math.pow(q, 2) / 4) + (Math.pow(p, 3) / 27);

        if (discriminant > 0) {
            double X1 = (Math.round(Math.pow((((q * (-1)) / 2) + Math.sqrt(discriminant)), 1.0 / 3.0))) +
                        (Math.round(Math.pow((((q * (-1)) / 2) - Math.sqrt(discriminant)), 1.0 / 3.0))) - (a / 3);
            return "Equation has got one root: X = " + X1;
        } else if ((int) discriminant == 0) {
            double X1 = -2 * (Math.pow((q / 2), 1.0 / 3.0)) - (a / 3);
            double X23 = (Math.pow((q / 2), 1.0 / 3.0)) - (a / 3);
            return "Equation has got three roots: X1 = " + X1 + ", X2 = X3 = " + X23;
        } else {
            double temp = (1.0 / 3.0) *
                    Math.pow(Math.sin(((3 * Math.sqrt(3) * q) / (2 * Math.pow(Math.sqrt(-p), 3)))), -1);
            double X1 = (2 / Math.sqrt(3)) * Math.sqrt(-p) * Math.sin(temp) - (a / 3);
            double X2 = (2 / Math.sqrt(3)) * Math.sqrt(-p) * Math.sin(temp + (Math.PI / 3)) - a / 3;
            double X3 = (2 / Math.sqrt(3)) * Math.sqrt(-p) * Math.cos(temp + (Math.PI / 6)) - a / 3;
            return "Equation has got three roots: X1 = " + X1 + ", X2 = " + X2 + ", X3 = " + X3;
        }
    }
}
