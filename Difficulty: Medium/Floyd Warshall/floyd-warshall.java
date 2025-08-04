class Solution {
    public void  floydWarshall(int[][] mat) {
        // Code here
       int V = mat.length;
       int INF = (int)1e8;

        // Initialize diagonal to 0
        for (int i = 0; i < V; i++) {
            mat[i][i] = 0;
        }

        // Floyd-Warshall Algorithm
        for (int k = 0; k < V; k++) {
            for (int i = 0; i < V; i++) {
                for (int j = 0; j < V; j++) {
                    if (mat[i][k] < INF && mat[k][j] < INF) {
                        if (mat[i][k] + mat[k][j] < mat[i][j]) {
                            mat[i][j] = mat[i][k] + mat[k][j];
                        }
                    }
                }
            }
        }
    }
}