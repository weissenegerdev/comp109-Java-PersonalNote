public class distance_array {

    public static void main(String[] args) {
        
        String cities[] = {"İstanbul", "Ankara", "İzmir", "Antalya"};
        
        int cityDistances[][] = {
            {0, 455, 480, 694},
            {455, 0, 587, 475},
            {480, 587, 0, 457},
            {694, 475, 457, 0}
        };

        int minDist = minDistance(cityDistances);
        int maxDist = maxDistance(cityDistances);

        System.out.println("Shortest distance: " + minDist);
        System.out.println("Cities with shortest distance: " + findCities(cityDistances, minDist));

        System.out.println("Highest distance: " + maxDist);
        System.out.println("Cities with highest distance: " + findCities(cityDistances, maxDist));
    }

    public static int minDistance(int distance2D[][]) {
        int minDist = distance2D[0][1];
        for (int i = 0; i < distance2D.length; i++) {
            for (int j = i + 1; j < distance2D[i].length; j++) {
                if (distance2D[i][j] < minDist) {
                    minDist = distance2D[i][j];
                }
            }
        }
        return minDist;
    }

    public static int maxDistance(int distance2D[][]) {
        int maxDist = distance2D[0][1];
        for (int i = 0; i < distance2D.length; i++) {
            for (int j = i + 1; j < distance2D[i].length; j++) {
                if (distance2D[i][j] > maxDist) {
                    maxDist = distance2D[i][j];
                }
            }
        }
        return maxDist;
    }

    public static String findCities(int distance2D[][], int dist) {
        String result = "";
        String cities[] = {"İstanbul", "Ankara", "İzmir", "Antalya"};

        for (int i = 0; i < distance2D.length; i++) {
            for (int j = i + 1; j < distance2D[i].length; j++) {
                if (distance2D[i][j] == dist) {
                    result += cities[i] + " - " + cities[j] + "\n";
                }
            }
        }

        return result;
    }
}
