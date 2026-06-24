class Solution {
    public int lengthOfLongestSubstring(String s) {
        int left=0;
        int max=0;
        int c[]=new int[128];
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            c[ch]++;
            while(c[ch]>1){
                c[s.charAt(left)]--;
                left++;
            }
            max=Math.max(max,i-left+1);
        }
        return max;
    }
}
