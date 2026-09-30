class Solution {
    public String[] findWords(String[] words) {
        String row1="QWERTYUIOPqwertyuiop";
        String row2="ASDFGHJKLasdfghjkl";
        String row3="ZXCVBNMzxcvbnm";
        ArrayList<String>list=new ArrayList<>();
        for(String i:words){
            // i=i.toLowerCase();
            if(find(row1,i)||find(row2,i)||find(row3,i)){
                list.add(i);
            }
        }
      
    
    return list.toArray(new String[0]);
    }
    public static boolean find(String row,String s){
           
        for(char ch:s.toCharArray()){
            if(row.indexOf(ch)==-1){
                return false;
            }
        }
        return true;
    }
}
