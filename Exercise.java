import java.util.Scanner;

public class Exercise {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] distinctNumbers = new int[10];
        int count = 0;

        System.out.print("Enter ten integers: ");
        for (int i = 0; i < 10; i++) {
            int num = scanner.nextInt();

            if (!isI1
            nArray(distinctNumbers, count, num)) {
                distinctNumbers[count] = num;
                count++;
            }
        }

        System.out.println("The number of distinct integers is " + count);
        System.out.print("The distinct integers are ");
        for (int i = 0; i < count; i++) {
            System.out.print(distinctNumbers[i] + " ");
        }
        System.out.println();

        scanner.close();
    }

    public static boolean isInArray(int[] array, int size, int num) {
        for (int i = 0; i < size; i++) {
            if (array[i] == num) {
                return true;
            }
        }
        return false;
    }
}
