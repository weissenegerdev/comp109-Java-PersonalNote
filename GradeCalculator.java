import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Getting user input for the cumulative point grade
        System.out.print("Enter your cumulative point grade: ");
        double pointGrade = input.nextDouble();

        // Determine the letter grade and GPA based on the point grade
        if (pointGrade >= 95) {
            System.out.println("A (4.0)");
        } else if (pointGrade >= 90) {
            System.out.println("A- (3.7)");
        } else if (pointGrade >= 85) {
            System.out.println("B+ (3.3)");
        } else if (pointGrade >= 80) {
            System.out.println("B (3.0)");
        } else if (pointGrade >= 75) {
            System.out.println("B- (2.7)");
        } else if (pointGrade >= 70) {
            System.out.println("C+ (2.3)");
        } else if (pointGrade >= 65) {
            System.out.println("C (2.0)");
        } else if (pointGrade >= 60) {
            System.out.println("C- (1.7)");
        } else if (pointGrade >= 55) {
            System.out.println("D+ (1.3)");
        } else if (pointGrade >= 50) {
            System.out.println("D (1.0)");
        } else {
            System.out.println("F (0.0)");
        }

        input.close();
    }
}
