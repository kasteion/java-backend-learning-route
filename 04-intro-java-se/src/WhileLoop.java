public class WhileLoop {
    static boolean isLightOn = false;
    public static void main(String[] args) {
       toogleLight();
       int times = 0;
       while (isLightOn && times < 10){
           System.out.println("WHILE:");
           printSOS();
           times++;
       }

       for (int i = 0; i <= 10; i++){
           System.out.println("FOR:");
           printSOS();
       }
    }

    public static void printSOS() {
        System.out.println(". . . _ _ _ . . .");
    }

    public static boolean toogleLight(){
        isLightOn = (isLightOn) ? false : true;
        return isLightOn;
    }
}
