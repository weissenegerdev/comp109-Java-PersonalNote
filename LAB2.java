   import java.util.Scanner;
        public class LAB2 {
            public static void main(String[] strings) {
            Scanner input = new Scanner(System.in);
            
            System.out.println("Please write the values a, b and c of the equation respectively (ax^2 + bx + c):");
            double a = input.nextDouble();
            double b = input.nextDouble();
            double c = input.nextDouble();
            
            double discriminant = (Math.pow(b, 2) - 4 * a * c);
            
            if (discriminant < 0) {
                System.out.println("The equation has no real roots.");
            }
             else if (discriminant == 0) {
                double root1 = -b / (2 * a);
                System.out.println("The equation has one real root: " + root1);
            }
             else {
                double root1 = (-b + Math.pow(discriminant, 0.5)) / (2 * a);
                double root2 = (-b - Math.pow(discriminant, 0.5)) / (2 * a);
                System.out.println("First root = " + root1 + ", Second root = " + root2);
            }
            input.close();
        }
    }
    