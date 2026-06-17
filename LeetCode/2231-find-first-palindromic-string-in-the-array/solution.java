class Solution {
    public boolean isPalindrome(String words){
        String s="";
        for(int i=words.length()-1;i>=0;i--){
            s+=words.charAt(i);
        }
        return s.equals(words);

    }
    public String firstPalindrome(String[] words) {
        for(int i=0;i<words.length;i++){
       
        if(isPalindrome(words[i])){
            return words[i];
        }
    }
        return "";
}
}
