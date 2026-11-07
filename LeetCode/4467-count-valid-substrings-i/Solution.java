class Solution {
    public long countValidSubstrings(String s) {
        long totalValid=0;
        long validEH=0;

        for(int i=0; i<s.length(); i++){
            if(i>=2 && s.charAt(i-2) == 'a' && s.charAt(i-1) == 'b' && s.charAt(i) == 'c'){ 
            validEH=2;
        } else{
            validEH++;
        }
        totalValid += validEH;
    }
    return totalValid;
}
public static void main(String[] args){
    Solution solver=new Solution();
    System.out.println(solver.countValidSubstrings("abac"));
    System.out.println(solver.countValidSubstrings("abc"));
}
}