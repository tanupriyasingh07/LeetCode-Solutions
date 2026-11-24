class Solution {
    public int profitableSchemes(int n, int minProfit, int[] group, int[] profit) {
        int MOD=1000000007;
        int len=group.length;

        int[][][] dp=new int[len+1][n+1][minProfit+1];
        for(int i=0; i<=n; i++){
            dp[0][i][0]=1;
        }
        for(int i=1; i<=len; i++){
            int people=group[i-1];
            int gain=profit[i-1];

            for(int j=0; j<=n; j++){
                for(int p=0; p<=minProfit; p++){

                    dp[i][j][p]=dp[i-1][j][p];

                    if(j>=people){
                        int newProfit=Math.max(0,p-gain);
                    dp[i][j][p]=(int) ((dp[i][j][p] + (long) dp[i-1][j-people][newProfit])%MOD);
                }
            }
        }
    }
    return dp[len][n][minProfit];
}
}