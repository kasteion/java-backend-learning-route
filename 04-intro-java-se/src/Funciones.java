public class Funciones {

    public static double circleArea(double radius){
        return Math.PI * Math.pow(radius, 2);
    }

    public static double shpereArea(double radius){
        return 4 * Math.PI * Math.pow(radius, 2);
    }

    public static double sphereVolume(double radius){
        return (4/3) * Math.PI * Math.pow(radius, 3);
    }
    public static void main(String[] args) {
        double y = 3;
        double area = circleArea(y);
        double sArea = sphereVolume(y);
        double sVolume = sphereVolume(y);
        System.out.println("The area of the circle with radius " + Double.toString(y) + " is " + Double.toString(area) + " square units.");
        System.out.println("The area of the sphere with radius " + Double.toString(y) + " is " + Double.toString(sArea) + " square units.");
        System.out.println("The volume of the sphere with radius " + Double.toString(y) + " is " + Double.toString(sVolume) + " square units.");
    }
    
}