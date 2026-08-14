class Solution {
    public int maximumLengthSubstring(String s) {
        int left=0;
        int right=0;
        int k=2;
        int max=0;
        LinkedHashMap<Character,Integer>map=new LinkedHashMap<>();
        while(left<s.length()&&right<s.length()){
            map.put(s.charAt(right),map.getOrDefault(s.charAt(right),0)+1);
            while(map.get(s.charAt(right))>k){
                map.put(s.charAt(left),map.get(s.charAt(left))-1);
                left++;
            }
            max=Math.max(max,right-left+1);
            right++;
        }
        return max;
    }
}
