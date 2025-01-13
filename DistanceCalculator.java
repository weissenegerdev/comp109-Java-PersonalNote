import java.util.Scanner;

public class DistanceCalculator {

     public static double distance3D(double x1, double y1, double z1, double x2, double y2, double z2) {
        return Math.sqrt((x1 - x2) * (x1 - x2) + (y1 - y2) * (y1 - y2) + (z1 - z2) * (z1 - z2));
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter x1: ");
        double x1 = scanner.nextDouble();
        System.out.print("Enter y1: ");
        double y1 = scanner.nextDouble();
        System.out.print("Enter z1: ");
        double z1 = scanner.nextDouble();

        System.out.print("Enter x2: ");
        double x2 = scanner.nextDouble();
        System.out.print("Enter y2: ");
        double y2 = scanner.nextDouble();
        System.out.print("Enter z2: ");
        double z2 = scanner.nextDouble();

        double distance = distance3D(x1, y1, z1, x2, y2, z2);
        System.out.println("The distance between the two points is: " + distance);

        scanner.close();
    }
}
