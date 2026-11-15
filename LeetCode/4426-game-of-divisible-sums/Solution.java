class Solution {
    public long maxDifference(int[] nums) {
        int n=nums.length;
        long[] dp=new long[n+1];

        for(int i=n-1; i>=0; i--){
            long take1 = nums[i]+(nums[i] % 3 == 0 ? -dp[i+1] : dp[i+1]);
            dp[i]=take1;

            if(i+1<n){
                long sum2=(long) nums[i] + nums[i+1];
                long take2=sum2+(sum2%3==0 ? -dp[i+2] : dp[i+2]);
                dp[i]=Math.max(dp[i],take2);
            }
        }
        return dp[0];
    }
}