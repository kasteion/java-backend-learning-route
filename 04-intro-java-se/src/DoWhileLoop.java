import java.util.Scanner;

public class DoWhileLoop {

    public static void printMenu(){
        System.out.println("Selecciona el número de la opción deseada:");
        System.out.println("1. Movies");
        System.out.println("2. Series");
        System.out.println("0. Salir");
    }
    public static void main(String[] args) {
        printMenu();
        Scanner sc = new Scanner(System.in);
        int response = Integer.valueOf(sc.nextLine());
        do {
            switch(response){
                case 0:
                    System.out.println("Gracias por visitarnos");
                    break;
                case 1: 
                    System.out.println("Has seleccionado Movies.");
                    break;
                case 2: 
                    System.out.println("Has seleccionado Series.");
                    break;
                default:
                    System.out.println("Has seleccionado una opción inválida.");
            }
            printMenu();
            response = Integer.valueOf(sc.nextLine());
        } while(response != 0 );
        System.out.println("Gracias por visitarnos.");
        System.out.println("Se terminó el programa.");
        sc.close();
    }
}