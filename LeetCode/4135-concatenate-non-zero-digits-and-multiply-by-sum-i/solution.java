class Solution {
    public long sumAndMultiply(int n) {
        int sum=0;
        int total=0;
        int mult=1;
        while(n>0){
           int digits=n%10;
           sum+=digits;
            if(digits!=0){
                total+=digits*mult;
            mult*=10;
            }
            n/=10;
        }
        return (long)total*sum;
    }
}
