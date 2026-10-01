class Solution {
    public boolean isPalindrome(String s) {
        
        
       int left=0;
       int right=s.length()-1;
       while(left<right){
        char ch1=s.charAt(left);
        char ch2=s.charAt(right);
        if(!((ch1>='A' && ch1<='Z') ||(ch1>='a' && ch1<='z')|| (ch1>='0' && ch1<='9'))){
            left++;
            continue;
        }
        if(!((ch2>='A' && ch2<='Z') ||(ch2>='a' && ch2<='z')|| (ch2>='0' && ch2<='9'))){
           right--;
            continue;
        }
        if(Character.toLowerCase(ch1)!=Character.toLowerCase(ch2)){
            return false;
        }
        left++;
        right--;
       }
       return true;
    }
}
