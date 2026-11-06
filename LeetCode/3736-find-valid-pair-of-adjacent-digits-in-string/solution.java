class Solution {
    public String findValidPair(String s) {
        HashMap<Integer,Integer>map=new HashMap<>();
        for(char ch:s.toCharArray()){
            map.put(ch-'0',map.getOrDefault(ch-'0',0)+1);
        }
       for(int i=0;i<s.length()-1;i++){
        int a=s.charAt(i)-'0';
        int b=s.charAt(i+1)-'0';
        if(a!=b && a==map.get(a) && b==map.get(b)){
           return ""+a+b;
        }
       }
        return "";
    }
}
