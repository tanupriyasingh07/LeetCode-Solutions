class Solution {
    public int minRange(int a, int b, int c) {
       int[] num={a,b,c};
        Arrays.sort(num);
        return Math.min(num[2]-num[0],num[1]);
    }
}