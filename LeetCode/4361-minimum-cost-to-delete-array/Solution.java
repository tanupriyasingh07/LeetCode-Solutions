class Solution {
    public long minCost(int[] nums) {
        int l=nums.length;
        long inf=(long) 1e15;
        long[][] f=new long[l+1][3];

        f[0][0]=0;
        f[0][1]=inf;
        f[0][2]=inf;

        for(int i=0; i<l; i++){
            long v=nums[i];
            f[i+1][0]=f[i][1]+v;
            f[i+1][1]=Math.min(f[i][0]+v, Math.min(f[i][1],f[i][2]+v));
            f[i+1][2]=Math.min(f[i][2],f[i][1]+v);
        }
        return f[l][0];
    }
}