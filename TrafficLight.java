//Pseudocode: If (“RED”) then “STOP”
//Else if (“YELLOW”) then “READY”
//Else if (“GREEN”) then “GO”
//Else “unknown code”

import java.util.Scanner;

public class TrafficLight {

    public static void main(String[] Strings) {

        Scanner input = new Scanner(System.in);
        System.out.println("Input a color code for the traffic lights (R, Y, G): ");
        String colorCode = input.next();
        
        // String karşılaştırması için equals() kullanılıyor
        if (colorCode.equals("R")) {   
            System.out.println("STOP!"); 
        }
        else if (colorCode.equals("Y")) {
            System.out.println("READY!"); 
        }
        else if (colorCode.equals("G")) {
            System.out.println("GO!"); 
        }
        else { 
            System.out.println("Unknown code!"); 
        }
        
        input.close();
    }
}
