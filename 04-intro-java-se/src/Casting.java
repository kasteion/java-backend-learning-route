public class Casting {
    public static void main(String[] args) {
        // En un año ubicar 30 perritos
        // Cuántos perritos ubique al mes

        double monthlyDogs = 30.0/12.0;
        // Estimación
        int estimatedMonthlyDogs = (int) monthlyDogs;
        System.out.println(String.valueOf(estimatedMonthlyDogs));
        
        // Exactitud
        int a = 30;
        int b = 12;
        System.out.println(String.valueOf((double) a/b));

        // Casteo automático
        double c = a/b;
        System.out.println(String.valueOf(c));

        char n = '1';
        int nI = n;
        // El character '1' es 49
        System.out.println(String.valueOf(nI));
        // Esto no se puede pues el char es más grande que short
        //short nS = n;
        short nS = (short) n;
        System.out.println(String.valueOf(nS));
    }
}
