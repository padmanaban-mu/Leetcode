class Solution {
    public boolean isSameAfterReversals(int num) {
        int num1=isReverse(num);
        int num2=isReverse(num1);
        return (num==num2);
    }
    public static int isReverse(int num){
        int rev=0;
        while(num>0){
            int digit=num%10;
            rev=rev*10+digit;
            num/=10;
        }
        return rev;
    }
}
