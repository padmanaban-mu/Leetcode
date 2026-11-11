class Solution {
    public int rearrangeCharacters(String s, String target) {
        int count1[]=new int[26];
        int count2[]=new int[26];
        for(char ch:s.toCharArray()){
            count1[ch-'a']++;
        }
        for(char ch:target.toCharArray()){
            count2[ch-'a']++;
        }

       int min=Integer.MAX_VALUE;
       for(char ch:target.toCharArray()){
        if(count2[ch-'a']>0){
        min=Math.min(min,count1[ch-'a']/count2[ch-'a']);
        }
       }
       return min;
    }
}
