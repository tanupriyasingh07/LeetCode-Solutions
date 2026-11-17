class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
         return atMost(nums, k) - atMost(nums, k-1);
    }
    public int atMost(int[] nums, int k) {

        int n = nums.length;
        int s = 0;
        int e = 0;
        int len = 0;
        int oddCount = 0;

        while(e < n) {

            if(nums[e] % 2 != 0) {
                oddCount++;
            }

            while(oddCount > k) {
                if(nums[s] % 2 != 0) {
                    oddCount--;
                }
                s++;
            }

            len += e - s + 1;
            e++;
        }
        return len;
    }
}