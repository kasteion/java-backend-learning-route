public class DataTypes {
    public static void main(String[] args) {
        // Una variable integer solo puede tener 10 digitos.
        int n = 1234567890;
        // La l es porque si no la colocamos no lo recnoce como un número long 
        // sino cree que es un integer
        long nL = 12345678901L;
        System.out.println(n);
        System.out.println(nL);

        double nD = 123.456;
        float nF = 123.456F;
        System.out.println(nD);
        System.out.println(nF);

        var salary = 1000;
        var pension = salary * 0.03;
        var totalSalary = salary - pension;
        var employeeName = "Fredy Castellón";

        // System.out.println(salary);
        // System.out.println(pension);
        System.out.println(totalSalary);
        System.out.println("EMPLOYEE: " + employeeName + ", SALARY: $" + String.valueOf(totalSalary));
    }
}
