class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        LinkedHashMap<String,List<String>>map=new LinkedHashMap<>();
        for(String current:strs){
            char ch[]=current.toCharArray();
            Arrays.sort(ch);
            String s=new String(ch);
            if(!map.containsKey(s)){
                map.put(s,new ArrayList<>());
            }
            map.get(s).add(current);
        }
        return new ArrayList<>(map.values());
}
}
