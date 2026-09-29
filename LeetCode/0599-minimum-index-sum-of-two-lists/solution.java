class Solution {
    public String[] findRestaurant(String[] list1, String[] list2) {
       LinkedHashMap<Integer,ArrayList<String>>map=new LinkedHashMap<>();
       int min=Integer.MAX_VALUE;
       for(int i=0;i<list1.length;i++){
        for(int j=0;j<list2.length;j++){
            if(list1[i].equals(list2[j])){
                if(min>=i+j){
                    min=i+j;
                   map.computeIfAbsent(min,k->new ArrayList<>()).add(list1[i]);
            }
        }
       }
       }
       ArrayList<String>list=map.get(min);
      
       String str[]=new String[list.size()];
       for(int i=0;i<list.size();i++){
        str[i]=list.get(i);
       }
       return str;
    }
}
