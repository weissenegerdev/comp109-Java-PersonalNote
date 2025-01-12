import java.util.Scanner;
    public class MathPractiseProject {
     public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int number1 = (int) (Math.random() * 10);
        int number2 = (int) (Math.random() * 10);

        System.out.print("What is " + number1 + " + " + number2 + "? ");
        
        int result = input.nextInt();
        
        int Canswer = number1 + number2;     //Canswer is Correct answer
        if (result == Canswer) {
            System.out.println("Correct!");
        } else {
            System.out.println("False! The correct answer is " + Canswer + ".");
        }

        input.close();
    }
}
