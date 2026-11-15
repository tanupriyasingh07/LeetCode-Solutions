class Solution {
    public int maxVowels(String s, int k) {
        int n = s.length();
        int count = 0;

        for(int i = 0; i < k; i++) {
            char ch = s.charAt(i);
            if( ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u') {
                    count++;
                }
        }

            int max=count;

            for(int i = k; i < n; i++) {
               char out = s.charAt(i-k);

                if( out=='a' || out=='e' || out=='i' || out=='o' || out=='u') {
                    count--;
                }
            char in = s.charAt(i);

            if(in=='a' || in=='e' || in=='i' ||
               in=='o' || in=='u') {
                count++;
            }

            max = Math.max(max, count);
        }

        return max;
    }
}