class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
     int n = nums.length;
        int s = 0, e = 0;
        int len1 = 0, sum = 0;

        while(e < n) {
            sum += nums[e];

            while(sum > goal) {
                sum -= nums[s];
                s++;
            }
            len1 += e - s + 1;
            e++;
        }
        s = 0;
        e = 0;
        int len2 = 0;
        sum = 0;

        while(e < n) {
            sum += nums[e];

            while(s <= e && sum > goal - 1) {
                sum -= nums[s];
                s++;
            }
            len2 += e - s + 1;
            e++;
        }
        return len1 - len2;
    }
}