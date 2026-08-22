class Solution {
    public boolean checkDivisibility(int n) {
        int sum=0;
        int product=1;
        int num1=n;
          while(num1>0){
            int rem= num1%10;
            sum+=rem;
            product*=rem;
            num1/=10;
        }

        return (n%(sum+product)==0) ;
    }
}
