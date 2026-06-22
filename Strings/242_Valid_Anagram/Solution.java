class Solution {
    public boolean isAnagram(String s, String t) {
        char s1[]=s.toCharArray();
        char s2[]=t.toCharArray();
        Arrays.sort(s1);
        Arrays.sort(s2);
        String str=new String(s1);
        String str2=new String(s2);
        if(str.equals(str2)){
            return true;
        }
        return false;
    }
}