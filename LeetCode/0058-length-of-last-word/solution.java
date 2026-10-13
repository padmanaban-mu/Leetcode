class Solution {
    public int lengthOfLastWord(String s) {
       int len=0;
       int i=s.length()-1;
       while(i>=0){
        if(s.charAt(i)==' ' && len==0){
            i--;
            continue;
        } 
        if(s.charAt(i)==' ' &&len>0){
            break;
        }
        i--;
        len++;
       }
       return len;
    }
}
