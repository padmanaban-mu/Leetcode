class Solution {
    public int countDigits(int num) {
        int max=0,number=num;
        while(num>0){
           if(number%(num%10)==0){
            max++;
           }
            num/=10;
        }
        return max;
    }
}
