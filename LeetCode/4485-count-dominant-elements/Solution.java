class Solution {
    public int countDominantElements(int[] nums) {
        int l=nums.length;
        if(nums.length==1) return 1;

        int ans=0; 
        for(int i=0; i<l; i++){
            if(i==0){
                
            if(nums[0]>=nums[1]) ans++;  
            }else if(i==l-1){
            if(nums[l-1]>=nums[l-2]) ans++;
        } else {
            if(2L*nums[i]>=(long) nums[i-1]+nums[i+1]) ans++;
            }
        }
        return ans;
    }
}