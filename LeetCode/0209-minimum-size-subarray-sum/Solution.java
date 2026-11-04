class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int n = nums.length;
        int s = 0;
        int e = 0;
        int len = Integer.MAX_VALUE;
        int curr = 0;

        while(e < n) {
            curr += nums[e];
            while(curr >= target) {
                len = Math.min(len, e-s+1);
                curr -= nums[s];
                s++;
            }
            e++;
        }
        if(len == Integer.MAX_VALUE) {
            return 0;
        }
        return len;
    }
}