public class UpdatingVariable {
    public static void main(String[] args) {
        int salary = 1500;
        System.out.println(salary);
        salary += 300;
        System.out.println(salary);

        String employeeName = "Augusto Castellón";
        System.out.println(employeeName);
        employeeName += " Bedoya";
        System.out.println(employeeName);
        employeeName = "Fredy " + employeeName;
        System.out.println(employeeName);
    }
}
