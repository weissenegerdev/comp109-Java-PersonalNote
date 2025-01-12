
import java.util.Scanner;
public class LAB3 {
 
public static void main(String[] args){
 
Scanner input = new Scanner(System.in);
 
System.out.println("Please enter values of a, b and c");
 
 
System.out.println("a = ");
 
double a = input.nextDouble();
 
System.out.println("b = ");
 
double b = input.nextDouble();
 
System.out.println("c = ");
 
double c = input.nextDouble();
 
 
double s = (a+b+c)/2;
 
 
if (a + b > c && a + c > b && b + c > a) {
 
double area = Math.sqrt(s * (s - a) * (s - b) * (s - c));
 
 
 
System.out.println("The perimeter of the triangle is = " + s);
 
System.out.println("The area of the triangle is " + area);
 
}
 
else {
 
System.out.println("Invalid input. The lengths do not form a valid triangle.");
 
}
 
 
input.close();
 
}
 
}


