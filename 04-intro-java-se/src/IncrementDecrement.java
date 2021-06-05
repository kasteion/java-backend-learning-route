public class IncrementDecrement {
    public static void main(String[] args) {
        int lives = 5;
        lives = lives - 1;
        System.out.println(lives); //4
        // Operador Decremento en forma postfija
        lives--;
        System.out.println(lives); //3
        // Operador Incremento en forma postfija
        lives++;
        System.out.println(lives); // 4

        // Prefija
        int gift = 100 + lives++; // postfijo
        System.out.println(gift);
        gift = 100 + ++lives; // prefijo
        System.out.println(gift);
    }
}
