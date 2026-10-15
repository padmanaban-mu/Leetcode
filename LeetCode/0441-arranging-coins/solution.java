class Solution {
    public int arrangeCoins(int n) {
        int rem=n;
        int i;
     for(i=1;i<=n;i++){
        if(rem<i){
            break;
        }
        rem-=i;
     } 
    return i-1;
    }
}
