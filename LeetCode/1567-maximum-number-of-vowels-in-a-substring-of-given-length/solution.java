class Solution {
    public int maxVowels(String s, int k) {
        String vowels="aeiou";
        int count=0,max=0;
        for(int i=0;i<k;i++){
            if(vowels.contains(s.charAt(i)+"")){
                count++;
            }
        }
        max=Math.max(max,count);
        for(int i=k;i<s.length();i++){
            if(vowels.contains(s.charAt(i-k)+"")){
                count--;
            }
            if(vowels.contains(s.charAt(i)+"")){
                count++;
            }
            max=Math.max(max,count);
        }
        return max;
    }
}
