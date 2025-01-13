import java.util.Scanner;
public class LeapYearProjectV2{

    public static Boolean leapYear(int year) {
        if (year % 400 == 0) return true;
        else if (year % 100 == 0) return false;          //1
        else if (year % 4 == 0) return true;
        else return false;
    }

    public static Boolean leapYearV2(int year) {
        return (year % 400 == 0) || ((year % 100 != 0) && (year % 4 == 0));             //2
    }

    public static Boolean leapYearV3(int year) {
        return year % 4 == 0 && (year % 100 != 0 || year % 400 == 0);        //3
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
            System.out.print("Enter a year: ");
        int year = scanner.nextInt();
            System.out.println("LeapYear(" + year + "): " + leapYear(year));
        System.out.println("LeapYearV2(" + year + "): " + leapYearV2(year));
        System.out.println("LeapYearV3(" + year + "): " + leapYearV3(year));

        scanner.close();
    }
}
