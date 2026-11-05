class Solution {
    public String frequencySort(String s) {
        char ch[]=s.toCharArray();
        StringBuilder sb=new StringBuilder();
        Arrays.sort(ch);
        LinkedHashMap<Character,Integer>map=new LinkedHashMap<>();
        for(int i=0;i<ch.length;i++){
            map.put(ch[i],map.getOrDefault(ch[i],0)+1);
        }
        List<Character> keys = new ArrayList<>(map.keySet());
        Collections.sort(keys, (a, b) -> map.get(b) - map.get(a));
        for (char key : keys) {
            for(int i=0;i<map.get(key);i++){
            sb.append(key);
        }
        }
        return sb.toString();
    }
}
