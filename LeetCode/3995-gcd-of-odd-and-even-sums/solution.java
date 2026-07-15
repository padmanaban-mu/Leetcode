class Solution {
    public int gcdOfOddEvenSums(int n) {
        int even=0,odd=0;
        for(int i=1;i<=n*2;i++){
            if(i%2==0){
                even+=i;
            }else{
                odd+=i;
            }
        }
        return findGcd(even,odd);
    }
    public static int findGcd(int a,int b){
        Math.abs(a);
        Math.abs(b);
        if(b==0){
            return a;
        }
        while(b!=0){
            int temp=b;
            b=a%b;
            a=temp;
        }
        return a;
    }
}
