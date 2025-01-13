import java.util.Scanner;

public class CoinToss {
    public static char headOrTail() {
        if (Math.random() < 0.5) return 'H';
        else return 'T';
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("How many times would you like to toss the coin? ");
        int tossCount = scanner.nextInt();
        System.out.println("Coin Toss Results:");
        for (int i = 0; i < tossCount; i++) {
            System.out.println("Toss " + (i + 1) + ": " + headOrTail());
        }
        scanner.close();
    }
}
