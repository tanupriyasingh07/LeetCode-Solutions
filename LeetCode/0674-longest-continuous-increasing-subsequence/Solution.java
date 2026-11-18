class Solution {
    public int findLengthOfLCIS(int[] nums) {
        int n = nums.length;
        int s = 0;
        int e = 0;
        int len = 0;

        while(e < n) {

            while(s < e && nums[e] <= nums[e - 1]) {
                s = e;
            }

            len = Math.max(len, e - s + 1);
            e++;
        }

        return len;
    }
}