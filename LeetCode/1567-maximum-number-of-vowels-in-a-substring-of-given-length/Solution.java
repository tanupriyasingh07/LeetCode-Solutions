class Solution {
    public boolean isVowel(char ch) {
        return ch=='a' || ch=='e' || ch=='i' ||
               ch=='o' || ch=='u';
    }
    public int maxVowels(String s, int k) {
        int n=s.length();

        int count=0;
        for(int i=0; i<k; i++){
            char ch=s.charAt(i);
            if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'){
                count++;
            }
        }
        int maxCount=count;
        for(int i=k; i<n; i++){
            char outgoing=s.charAt(i-k);
            char incoming=s.charAt(i);

            if(isVowel(outgoing)) count--;
            if(isVowel(incoming)) count++;

            maxCount=Math.max(maxCount,count);
        }
        return maxCount;
    }
}