class Solution {
    public int trailingZeroes(int n) {
        int trail=0;
        while(n>1){
            n/=5;
            trail+=n;
        }
        return trail;
    }
}
