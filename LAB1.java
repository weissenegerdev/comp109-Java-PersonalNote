import java.util.Scanner;
public class LAB1 {
  public static void main(String[] Strings) {
    Scanner input = new Scanner(System.in);
    
    System.out.println("Welcome to the MEF toast shop, please write your subtotal");     //user will enter subtotal
     double subtotal = input.nextDouble();                
    
    System.out.println("Please write the gratuity rate (as a percentage)");         //user will log in gratuity rate
     double gratuityrate = input.nextDouble();
      System.out.println();

    double gratuity = subtotal * (gratuityrate / 100);    //Here, the subtotal and tip rate transactions will be made and the value of the tip will be found.
    
    double total = (subtotal + gratuity);
     System.out.println();
    
    System.out.println("Gratuity = " + "$" + gratuity);   //The result will show the tip and total cost to be paid.
    System.out.println("Total remaining = " + "$" + total );
 
    input.close();

  }
}