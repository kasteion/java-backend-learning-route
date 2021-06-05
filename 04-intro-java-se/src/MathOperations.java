public class MathOperations {
    public static void main(String[] args) {
        double x = 2.1;
        double y = 3;

        System.out.println(Double.toString(Math.PI));
        System.out.println(Double.toString(Math.E));
        System.out.println(Double.toString(Math.ceil(x)));
        System.out.println(Double.toString(Math.floor(x)));
        System.out.println(Double.toString(Math.pow(x, y)));
        System.out.println(Double.toString(Math.max(x, y)));
        System.out.println(Double.toString(Math.sqrt(y)));
        // Area de un circulo
        // pi * r^2
        System.out.println(Double.toString(Math.PI * Math.pow(y, 2)));
        // Area de una esfera
        // 4*PI*r^2
        System.out.println(Double.toString(4 * Math.PI * Math.pow(y, 2)));
        // Volumen de una esfera
        // (4/3)*PI*r^3
        System.out.println(Double.toString(4/3 * Math.PI * Math.pow(y, 3)));
    }
}
