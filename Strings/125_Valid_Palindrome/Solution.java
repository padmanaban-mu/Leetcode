class Solution {
    public boolean isPalindrome(String s) {
        String temp="";
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch>='A' && ch<='Z'){
                temp+=(char)(ch+32);
            }
            else if(ch>='a' && ch<='z'){
                temp+=ch;
            }
            else if(ch>='0' && ch<='9'){
                temp+=ch;
            }
        }
        String rev="";
        for(int i=temp.length()-1;i>=0;i--){
            char ch=temp.charAt(i);
            rev+=ch;
        }
        if(temp.equals(rev)){
            return true;
        }
        return false;
    }
}