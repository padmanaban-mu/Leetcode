class Solution {
    public boolean detectCapitalUse(String word) {
        int index=0;
        int capital=0;
       
        for(int i=0;i<word.length();i++){
            char ch=word.charAt(i);
            if(ch>='A' && ch<='Z'){
                capital++;
                index=i;
            }
            else{
                continue;
            }
        }
        if(capital==word.length() || capital==0){
            return true;
        }else if(capital==1 &&index==0){
            return true;
        }
        return false;
    }
}
