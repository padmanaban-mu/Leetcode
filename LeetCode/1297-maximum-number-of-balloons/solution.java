class Solution {
    public int maxNumberOfBalloons(String text) {
        String balloon="balloon";
        HashMap<Character,Integer>map=new HashMap<>();
        map.put('b',0);
        map.put('a',0);
        map.put('l',0);
        map.put('o',0);
        map.put('n',0);

        for(int i=0;i<text.length();i++){
            if(balloon.contains(text.charAt(i)+"")){
                map.put(text.charAt(i),map.getOrDefault(text.charAt(i),0)+1);
            }
        }
        HashSet<Integer>set=new HashSet<>();
        map.put('l', map.get('l') / 2);
        map.put('o', map.get('o') / 2);
        for(int i:map.values()){
            set.add(i);
        }
       int min=Integer.MAX_VALUE;
       for(int element:set){
        min=Math.min(min,element);
       }
       return min;
    }
}
