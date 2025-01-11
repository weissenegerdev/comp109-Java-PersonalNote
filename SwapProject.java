import java.util.Scanner;

public class SwapProject {

    public static void main(String[] Strings) {

        Scanner input = new Scanner(System.in);

        System.out.println("Input an integer value for X:");

        int X = input.nextInt(); 

        System.out.println("Input an integer value for Y:");

        int Y = input.nextInt(); 

        int Z = X;

        X = Y;

        Y = Z;

        System.out.println("The final value of X is" + X);

        System.out.println("The final value of Y is" + Y);

        System.out.println("The final value of Z is" + Z);

        input.close();
    }
}