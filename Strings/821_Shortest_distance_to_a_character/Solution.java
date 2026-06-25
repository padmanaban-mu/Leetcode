class Solution {
    public int[] shortestToChar(String s, char c) {
        ArrayList<Integer>list=new ArrayList<>();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==c){
                list.add(i);
            }
        }
        int arr[]=new int[s.length()];
        for(int i=0;i<s.length();i++){
            int min=Integer.MAX_VALUE;
            for(int pos:list){
                min=Math.min(min,Math.abs(i-pos));
            }
            arr[i]=min;
        return arr;

    }
}