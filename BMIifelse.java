                           // BMI = weight(kg) / ( (height-m)* (height-m))

import java.util.Scanner;
public class BMIifelse {
    public static void main(String[] Strings) {
      
        Scanner input = new Scanner(System.in);
        System.out.println("Input your weight in kg: ");
        double weight = input.nextDouble();
        System.out.print("Input your height in meter: ");
        double height = input.nextDouble();
        double BMI = weight / (height*height);
        System.out.println("Your BMI score is:" + BMI);

        if (BMI < 18.5) 
            System.out.print("Underweight");
        else if (BMI < 25.0 && BMI >= 18.5)                     // && BMI >= 18.5 GEREKLİ DEĞİL
            System.out.print("Normal weight");
        else if (BMI < 30.0 && BMI >= 25.0)                     // && BMI >= 25.0 GEREKLİ DEĞİL
            System.out.print("Overweight");
        else if (BMI < 40.0 && BMI >= 30.0)                     // && BMI >= 30.0 GEREKLİ DEĞİL
            System.out.print("Obese");
       else
            System.out.print("Severe obese");

        input.close();
    }
}

                 // Programming = Design + Coding
                  // Pseudocode : outline for a piece of code

