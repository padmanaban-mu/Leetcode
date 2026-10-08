class Solution {
    public int maxDepth(String s) {
        int balance=0;
        int max=0;
        for(char ch:s.toCharArray()){
            if(ch=='('){
                balance++;
                if(balance>1){
                    max=Math.max(max,balance);
                }
            }else if(ch==')'){
                balance--;
            }
        }
        if(s.contains('('+"") &&max==0){
            return 1;
        }
        return max;
    }
}
