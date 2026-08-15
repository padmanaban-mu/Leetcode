class Solution {
    public boolean isPerfectSquare(int num) {
        int i=0;
        while((long)i*i<=num){
            if((long)i*i==num){
                return true;
            }
            i++;
        }
        return false;
    }
}
