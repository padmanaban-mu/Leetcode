class Solution {
    public int climbStairs(int n) {
        int first=0;
        int second=1;
        int next;
        int i=0;
        while(i<n){
            if(i<=1){
               next =i;
            }
            next=first+second;
            first=second;
            second=next;
            i++;
        }
        return second;
    }
}
