import java.util.Scanner;

public class BMIProject {

    public static void main(String[] Strings) {
        Scanner input = new Scanner(System.in);

        System.out.println("Input your weight in kg: ");
             double weight = input.nextDouble();

        System.out.print("Input your height in meter: ");   
             double height = input.nextDouble();

        double BMI = weight / (height*height);                     // BMI = weight(kg) / ( (height-m)* (height-m))

        System.out.println("Your BMI score is:" + BMI);


        input.close();
    }
} 