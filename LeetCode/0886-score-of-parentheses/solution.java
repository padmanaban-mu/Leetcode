class Solution {
    public int scoreOfParentheses(String s) {
       int count=0;
       int ans=0;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch=='('){
               count++;
            }else{
                count--;
                if(s.charAt(i-1)=='('){
                ans+=Math.pow(2,count);
            }
        }
        }
        return ans;
    }
}
