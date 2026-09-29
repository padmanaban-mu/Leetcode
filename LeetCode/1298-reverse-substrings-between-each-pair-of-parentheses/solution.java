class Solution {
    public String reverseParentheses(String s) {
        ArrayList<Integer>list1=new ArrayList<>();
        ArrayList<Integer>list2=new ArrayList<>();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='('){
                list1.add(i);
            }
            if(s.charAt(i)==')'){
                list2.add(i);
            }
        }
        StringBuilder sb=new StringBuilder(s);
        while(!list1.isEmpty()){
            int index1=0;
            int index2=Integer.MAX_VALUE;
            for(int i:list1){
                index1=Math.max(index1,i);
            }
            for(int i:list2){
                if(i>index1){
                index2=Math.min(index2,i);
                }
            }
            list1.remove(Integer.valueOf(index1));
            list2.remove(Integer.valueOf(index2));
            String reverse=reverse(sb.toString(),index1+1,index2-1);
            sb.replace(index1,index2+1,reverse);
            for(int i=0;i<list1.size();i++){
                if(list1.get(i)>index2){
                    list1.set(i,list1.get(i)-2);
                }
            }
            for(int i=0;i<list2.size();i++){
                if(list2.get(i)>index2){
                    list2.set(i,list2.get(i)-2);
                }
            }
        }
        return sb.toString();
    }
    public static String reverse(String s,int start,int end){
        String result="";
        for(int i=end;i>=start;i--){
            result+=s.charAt(i);
        }
        return result;
    }
}
