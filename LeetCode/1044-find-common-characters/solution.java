class Solution {
    public List<String> commonChars(String[] words) {
        HashMap<Character,Integer>map=new HashMap<>();
        List<String>list=new ArrayList<>();
        for(char ch:words[0].toCharArray()){
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        for(int i=1;i<words.length;i++){
        HashMap<Character,Integer>temp=new HashMap<>();
            for(char ch:words[i].toCharArray()){
                temp.put(ch,temp.getOrDefault(ch,0)+1);
            }
            for(char key:map.keySet()){
                map.put(key,Math.min(map.get(key),temp.getOrDefault(key,0)));
            }
        }
         for(char key : map.keySet()) {
            for(int i = 0; i < map.get(key); i++) {
                list.add(key + "");
            }
        }
        return list;
    }
}
