import java.util.Scanner;

public class threedarray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        double[][][] myList3D = new double[2][3][2];
        
        for (int i = 0; i < myList3D.length; i++) {
            for (int j = 0; j < myList3D[i].length; j++) {
                for (int k = 0; k < myList3D[i][j].length; k++) {
                    System.out.print("Please enter a double value for (i,j,k): (" + i + "," + j + "," + k + "): ");
                    myList3D[i][j][k] = input.nextDouble();
                }
            }
        }
        
        System.out.println("\nThe 3D array you entered is:");
        for (int i = 0; i < myList3D.length; i++) {
            for (int j = 0; j < myList3D[i].length; j++) {
                for (int k = 0; k < myList3D[i][j].length; k++) {
                    System.out.print("myList3D[" + i + "][" + j + "][" + k + "] = " + myList3D[i][j][k] + "\t");
                }
                System.out.println();
            }
        }
        
        input.close();
    }
}
