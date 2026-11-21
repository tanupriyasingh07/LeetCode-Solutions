class Solution {
    public String[] assignUmbrella(int[] rain) {
        String[] ans=new String[rain.length];
        int a=0; 
        int b=0;

        for(int i=0; i<rain.length; i++){
            boolean bob=(rain[i]==1);
            boolean alice=(i+1<rain.length && rain[i]==1 && rain[i+1]==1);

            if(!alice && !bob){
                ans[i]="None";
            }else if(alice && bob){
                if(a<=b){
                    ans[i]="Alice";
                    a++;
                }else{
                    ans[i]="Bob";
                    b++;
                }
            }else if(alice){
                ans[i]="Alice";
                a++;
            }else{
                ans[i]="Bob";
                b++;
            }
        }
        return ans;
    }
}