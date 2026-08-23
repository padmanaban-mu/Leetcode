class Solution {
    public boolean sumGame(String num) {
        int q=0;
        int sum=0;
        int n=num.length();
        for(int i=0;i<n/2;i++){
            char ch=num.charAt(i);
            if(ch=='?'){
                q++;
            }else{
                sum+=ch-'0';
            }
        }
        for(int i=n/2;i<n;i++){
            char ch=num.charAt(i);
            if(ch=='?'){
                q--;
            }else{
                sum-=ch-'0';
            }
        }
        if(q%2==0 && sum+(q/2)*9==0){
            return false;
        }
        return true;
    }
}
