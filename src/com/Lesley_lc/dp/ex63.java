public class ex63 {
    public static int uniquePathsWithObstacles(int[][] obstableGrid) {
        // System.out.println(obstableGrid.length);
        // System.out.println(obstableGrid[0].length);
        int m = obstableGrid.length;
        int n = obstableGrid[0].length;
        if (m*n == 1) return 1;

        int [][] dp = new int[m][n];
        dp[0][0] = obstableGrid[0][0] == 0 ? 1: 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (obstableGrid[i][j] == 1) dp[i][j] = 0;
                else if (i > 0 && j > 0) 
                    dp[i][j] = dp[i-1][j] + dp[i][j-1];
                else if (i > 0) 
                    dp[i][j] = dp[i-1][j];
                else if (j > 0)
                    dp[i][j] = dp[i][j-1];
            }
        }
        return dp[m-1][n-1];
    }

    public static void main(String[] args) {
        
        // int[] [] obstacleGrid = {{0,1},{0,0}};
        int[] [] obstacleGrid = {{0,0,0},{0,1,0},{0,0,0}};

        System.out.println(uniquePathsWithObstacles(obstacleGrid));
    }
}
