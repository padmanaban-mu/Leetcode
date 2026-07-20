class Solution {
    public boolean isHappy(int n) {
        if(findHappy(n)){
            return true;
        }
        return false;
    }
    public static boolean findHappy(int n){
        int num=n,digits=0;
        while(num>0){
            digits++;
            num/=10;
        }
        if(digits==1){
            if(n==1||n==7){
            return true;
        }
        else{
            return false;
        }
        }
        num=n;
        int sum=0;
        while(num>0){
            int rem=num%10;
            sum+=(rem*rem);
            num/=10;
        }
        if(sum==1){
            return true;
        }else{
        return findHappy(sum);
        }
       
    }
}
      
