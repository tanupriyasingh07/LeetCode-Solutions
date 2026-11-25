class Solution {
    int[][] dp;

    public int change(int amount, int[] coins) {
        int n = coins.length;

        dp = new int[n][amount + 1];

        for (int[] row : dp) {
            Arrays.fill(row, -1);
        }

        return solve(0, amount, coins);
    }

    public int solve(int i, int rem, int[] coins) {

        if (rem == 0) return 1;

        if (i == coins.length) return 0;

        if (dp[i][rem] != -1) return dp[i][rem];

        int notPick = solve(i + 1, rem, coins);

        int pick = 0;

        if (coins[i] <= rem) {
            pick = solve(i, rem - coins[i], coins);
        }

        return dp[i][rem] = pick + notPick;
    }
}