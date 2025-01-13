import java.util.Scanner;

public class DiceRoll {
    public static int dice(int side) {
        int num = (int) ((Math.random() * side) + 1);
        return num;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of sides for the dice: ");
        int sides = scanner.nextInt();
        System.out.print("How many times would you like to roll the dice? ");
        int rollCount = scanner.nextInt();
        System.out.println("Dice Rolls Results:");
        for (int i = 0; i < rollCount; i++) {
            int rollResult = dice(sides);
            System.out.println("Roll " + (i + 1) + ": " + rollResult);
        }
        scanner.close();
    }
}
