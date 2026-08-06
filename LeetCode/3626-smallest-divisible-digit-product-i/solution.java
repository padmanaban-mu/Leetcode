class Solution {
    public int smallestNumber(int n, int t) {
        for(int i=n;i<=n*10;i++){
            if((findProduct(i))%t==0){
                return i;
            }
           
        }
        return -1;
    }
    public static int findProduct(int n){
        int product=1;
        while(n>0){
            product*=n%10;
            n/=10;
        }
        return product;
    }
}
