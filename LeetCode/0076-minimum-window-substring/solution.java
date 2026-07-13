class Solution {
    ArrayList<String>list=new ArrayList<>();
    public String minWindow(String s, String t) {
        if(s.length()<t.length()){
            return "";
        }
        int left=0;
        int freq[]=new int[128];
        int start=0;
        int minLen=Integer.MAX_VALUE;
        for(int i=0;i<t.length();i++){
            freq[t.charAt(i)]++;
        }
        int count=t.length();
        for(int right=0;right<s.length();right++){
            if(freq[s.charAt(right)]>0){
                count--;
            }
            freq[s.charAt(right)]--;
            while(count==0){
                if(right-left+1<minLen){
                    minLen=right-left+1;
                    
                    start=left;
                }
                freq[s.charAt(left)]++;
                if(freq[s.charAt(left)]>0){
                    count++;
                }
                left++;
            }
        }
        return minLen==Integer.MAX_VALUE? "":s.substring(start,start+minLen);
    }
}
