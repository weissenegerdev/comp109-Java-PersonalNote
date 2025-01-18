public class twodarray  {
    public static void main(String[] args) {
        int[][] exampleArray2D = new int[7][8];

        for (int i = 0; i < exampleArray2D.length; i++) {
            for (int j = 0; j < exampleArray2D[i].length; j++) {
                exampleArray2D[i][j] = (int) (Math.random() * 63 + 15);
            }
        }

        for (int i = 0; i < exampleArray2D.length; i++) {
            for (int j = 0; j < exampleArray2D[i].length; j++) {
                System.out.print(exampleArray2D[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
