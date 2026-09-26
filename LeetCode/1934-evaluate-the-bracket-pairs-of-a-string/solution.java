class Solution {
    public String evaluate(String s, List<List<String>> knowledge) {
        LinkedHashMap<String,String>map=new LinkedHashMap<>();
        ArrayList<Integer>list1=new ArrayList<>();
        ArrayList<Integer>list2=new ArrayList<>();
        for(List<String>i:knowledge){
            map.put(i.get(0),i.get(1));
        }
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='('){
                list1.add(i);
            }
            if(s.charAt(i)==')'){
                list2.add(i);
            }
        }
        StringBuilder sb=new StringBuilder(s);
        for(int j=list1.size()-1;j>=0;j--){
            StringBuilder current=new  StringBuilder();
            for(int i=list1.get(j)+1;i<list2.get(j);i++){
                current.append(s.charAt(i));
            }
            String key=current.toString();
            String value=map.getOrDefault(key,"?");
           sb.replace(list1.get(j),list2.get(j)+1,value);
        }
        
        return sb.toString();
    }
}
