class Solution {
    public int countGoodSubstrings(String s) {
        if(s.length()<3){
            return 0;
        }
        int max=0;
        int freq[]=new int[26];
        for(int i=0;i<3;i++){
            freq[s.charAt(i)-'a']++;
        }
        int sum=0;
        int count=0;
        int c=0;
        for(int i:freq){
            if(i==1){
                c++;
            }
        }

if(c==3){
    count++;
}
        for(int i=3;i<s.length();i++){
            sum=0;
            c=0;
            freq[s.charAt(i-3)-'a']--;
            freq[s.charAt(i)-'a']++;
            for(int j:freq){
                if(j==1){
                    c++;
                }
            }
            if(c==3){
                count++;
            }
        }
        return count;
    }
}
