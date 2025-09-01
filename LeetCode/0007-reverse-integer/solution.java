class Solution {
    public int reverse(int x) {
        int t=x;
    long s=0;
    while(t!=0){
            int rem=t%10;
            s=s*10+rem;
            t/=10;
        }
        if(s<Integer.MIN_VALUE || s>Integer.MAX_VALUE){
            return 0;
        }
        return (int)s;
        
    }
}
