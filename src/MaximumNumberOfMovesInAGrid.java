public class MaximumNumberOfMovesInAGrid {
    public static void main(String[] args) {
        int[][] grid = {{2, 4, 3, 5}, {5, 4, 9, 3}, {3, 4, 2, 11}, {10, 9, 13, 15}};

        System.out.println(maxMoves(grid));
    }

    private static int maxMoves(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int[][] dp = new int[m][n];
        int maxMoves = 0;

        // Initialize the first column
        for (int i = 0; i < m; i++) {
            dp[i][0] = 0;
        }

        // Fill the dp table
        for (int j = 1; j < n; j++) {
            for (int i = 0; i < m; i++) {
                dp[i][j] = -1;  // Initialize with -1 (unreachable)

                // Check the three possible previous positions
                for (int k = -1; k <= 1; k++) {
                    int prevRow = i + k;
                    if (prevRow >= 0 && prevRow < m && grid[i][j] > grid[prevRow][j - 1]) {
                        if (dp[prevRow][j - 1] != -1) {
                            dp[i][j] = Math.max(dp[i][j], dp[prevRow][j - 1] + 1);
                        }
                    }
                }

                // Update maxMoves
                if (dp[i][j] != -1) {
                    maxMoves = Math.max(maxMoves, dp[i][j]);
                }
            }
        }

        return maxMoves;
    }
}
