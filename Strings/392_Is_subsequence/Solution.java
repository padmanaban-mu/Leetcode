class Solution {
    public boolean isSubsequence(String s, String t) {
        String str="";
        int i=0;
        int j=0;
        int c=0;
        while(i<=s.length()-1 && j<=t.length()-1){
            char ch=s.charAt(i);
            char ch1=t.charAt(j);
            if(ch==ch1){
                str+=ch;
                i++;
                j++;
                c++;
            }
            else if(!t.contains(ch+"")){
                i++;
            }
            else{
                j++;
            }
        }
        if(c==s.length()){
            return true;
        }else{
            return false;
        }
    }
}