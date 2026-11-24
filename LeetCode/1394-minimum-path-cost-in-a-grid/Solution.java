class Solution {

    int[][] dp;

    public int minPathCost(int[][] grid, int[][] moveCost) {

        int m = grid.length;
        int n = grid[0].length;

        dp = new int[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                dp[i][j] = -1;
            }
        }

        int ans = Integer.MAX_VALUE;

        for (int j = 0; j < n; j++) {
            ans = Math.min(ans, solve(0, j, grid, moveCost));
        }

        return ans;
    }

    int solve(int i, int j, int[][] grid, int[][] moveCost) {

        int m = grid.length;
        int n = grid[0].length;

        if (i == m - 1) {
            return grid[i][j];
        }

        if (dp[i][j] != -1) {
            return dp[i][j];
        }

        int ans = Integer.MAX_VALUE;

        for (int k = 0; k < n; k++) {

            int cost = moveCost[grid[i][j]][k]
                     + solve(i + 1, k, grid, moveCost);

            ans = Math.min(ans, cost);
        }

        dp[i][j] = grid[i][j] + ans;

        return dp[i][j];
    }
}