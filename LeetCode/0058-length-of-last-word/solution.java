class Solution {
    public int lengthOfLastWord(String s) {
        String words[]=s.split(" ");
        int n=words.length;
        int m=words[n-1].length();
        return m;
    }
}
