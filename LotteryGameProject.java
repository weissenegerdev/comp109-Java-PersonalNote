import java.util.Scanner;
    public class LotteryGameProject {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int number = (int) (Math.random() * 90) + 10;

        System.out.print("Enter your two-digit number (11-99): ");
        int guessedNum = input.nextInt();

        if (guessedNum < 10 || guessedNum > 99) {
            System.out.println("Please enter a two-digit number!");
        }  else if (number == guessedNum) {
            System.out.println("Congratulations! You've won $10,000!" + " The winning number was: " + number);
        } else if ((number % 10 == guessedNum / 10) && (guessedNum % 10 == number / 10)) {
            System.out.println("Congratulations! You've won $3,000!" + " The winning number was: " + number);
        }  else if ((number % 10 == guessedNum / 10) || (guessedNum % 10 == number / 10) || 
                   (number % 10 == guessedNum % 10) || (guessedNum / 10 == number / 10)) {
            System.out.println("Congratulations! You've won $1,000!" + " The winning number was: " + number);
        } else {
            System.out.println("Sorry, no winnings this time. The winning number was: " + number);
        }
     input.close();
    }
}