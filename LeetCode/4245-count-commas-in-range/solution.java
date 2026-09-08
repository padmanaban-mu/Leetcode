class Solution {
    public int countCommas(int n) {
        int sum=0;
        int start=1000;
        if(n<start){
            return sum;
        }
        while(start<=n){
        sum++;
        start++;
    }
    return sum;
}
}
