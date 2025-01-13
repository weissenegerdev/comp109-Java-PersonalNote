import java.util.Scanner;
public class MaxNumberFinder {

    public static int maxOfTwo(int num1, int num2) {
        if (num1 > num2) return num1;
        else return num2;
    }

    public static int maxOfThree(int n1, int n2, int n3) {
        return maxOfTwo(maxOfTwo(n1, n2), n3);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first number (n1): ");
        int n1 = scanner.nextInt();
        System.out.print("Enter second number (n2): ");
        int n2 = scanner.nextInt();
        System.out.print("Enter third number (n3): ");
        int n3 = scanner.nextInt();

        int maxNumber = maxOfThree(n1, n2, n3);
        System.out.println("The greatest number among the three is: " + maxNumber);

        scanner.close();
    }
}
