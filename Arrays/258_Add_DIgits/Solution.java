class Solution {
    public static int sum(int num){
        int sum=0;
        while(num>0){
            int temp=num%10;
            sum+=temp;
            num/=10;
        }
        return sum;
    }
    public int addDigits(int num) {
        int s=sum(num);
        if(s>=10){
            while(s>=10){
                s=sum(s);
            }
        }
        return s;
    }
}