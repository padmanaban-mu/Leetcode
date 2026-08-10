class Solution {
    public boolean wordPattern(String pattern, String s) {
        char ch[]=pattern.toCharArray();
        String str[]=s.split(" ");
        if(ch.length!=str.length){
            return false;
        }
        LinkedHashMap<Character,String>map=new LinkedHashMap<>();
        for(int i=0;i<str.length;i++){
            char key=ch[i];
            String value=str[i];
            if(map.containsKey(key)){
                if(!map.get(key).equals(value)){
                    return false;
                }
            }
            else{
                if(map.containsValue(value)){
                    return false;
                }
                map.put(key,value);
            }
        }
        return true;
    }
}
