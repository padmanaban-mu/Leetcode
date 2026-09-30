class Solution {
    public int[] maxDepthAfterSplit(String seq) {
        int arr[]=new int[seq.length()];
        int depth=0;
        int k=0;
        for(char ch:seq.toCharArray()){
            if(ch=='('){
                arr[k++]=depth%2;
                depth++;
            }else{
                depth--;
                arr[k++]=depth%2;
            }
        }
        return arr;
    }
}
