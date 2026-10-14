class Solution {
    public boolean threeFibonacciSum(int n) {
        int a=0;
        int b=1;
        int c=a+b;
        while(a+b+c<=n){
            if(a+b+c==n){
                return true;
            }
            int t=b+c;
            a=b;
            b=c;
            c=t;
        }
return false;
    }
}
