class Solution {
    public String mergeAlternately(String word1, String word2) {
        char ch[]=word1.toCharArray();
        char c[]=word2.toCharArray();
        String s="";
        int i=0;
        int j=0;
        while(i<ch.length &&j<c.length){
            s+=ch[i];
            s+=c[j];
            i++;
            j++;
        }
        while(j<c.length|| i<ch.length){
            if(j<c.length){
                s+=c[j];
                j++;
            }else{
                s+=ch[i];
                i++;
            }
        }
        return s;
    }
}
