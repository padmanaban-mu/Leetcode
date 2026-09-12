class Solution {
    public long countCommas(long n) {
       long sum=0;
        long start=1000;
        if(n<start){
            return sum;
        }
        while(start<=n){
        sum+=(n-start+1);
        start*=1000;;
    }
    return sum;
    }
}
