class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        int n = arr.length;
        int requiredSum = k * threshold;



        int sum = 0;
        for (int i = 0; i < k; i++) {
                sum += arr[i];
            }
        

        int count = 0;
        if(requiredSum<=sum){
            count++;
        }
        for (int i = k; i < n; i++) {
            sum = sum - arr[i - k] + arr[i];
            if (requiredSum <= sum) {
                count++;
            }
        }
        return count;
    }
}