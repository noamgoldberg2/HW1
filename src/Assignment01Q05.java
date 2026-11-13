public class Assignment01Q05 {
    public static int findShortestPath(int[][] m, int i, int j) {
        if (i == j) {
            return 0;
        }
        int n = m.length;
        int [] dist = new int[n];
        for (int k = 0; k < n; k++) {
            dist[k] = -1;
        }
        dist[i] = 0;
        for (int d=0; d<n-1; d++) { 
            for (int u=0; u<n; u++){
                if (dist[u] == d) {
                    for (int v=0; v<n; v++) {
                        if (m[u][v] == 1 && dist[v] == -1) {
                            dist[v] = d + 1;
                        }

                    }
                        

                    }

                }

            } 
        return dist[j];
        }
    

    public static void main(String[] args) {
        System.out.println(
            findShortestPath(new int[][]{{0,0,0}, {0,0,0}, {0,0,0}}, 0, 1)); // -1
        System.out.println(
            findShortestPath(new int[][]{{0,0,0}, {0,0,0}, {0,0,0}}, 1, 1)); // 0
        System.out.println(
            findShortestPath(new int[][]{{0,1,0,0}, {0,0,1,0}, {0,0,0,1}, {1,0,0,0}}, 0, 2)); // 2
        System.out.println(
            findShortestPath(new int[][]{{0,1,0,1}, {0,0,0,1}, {0,0,0,0}, {0,0,1,0}}, 0, 2)); // 2
    }
}