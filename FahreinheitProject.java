import java.util.Scanner;

public class FahreinheitProject {

    public static void main(String[] Strings) {

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter a degree in Celsius");
            double Celsius = input.nextDouble();
               double Fahrenheit = ((Celsius * 9 / 5) + 32);
       
        System.out.println();

          System.out.println("Celsius = " + Celsius + " °C, Fahrenheit = " + Fahrenheit + " °F");
        input.close();
    }
} 