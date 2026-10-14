class Solution {
    public boolean validDigit(int n, int x) {
        boolean found=false;
        while(n>9){
            int num=n%10;
            if(num==x){
                found=true;
            }
            n/=10;
        }
        return found && (n!=x);
    }
}
