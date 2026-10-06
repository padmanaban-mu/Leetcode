class Solution {
    public boolean checkValidString(String s) {
        Stack<Character>stack=new Stack<>();
        int cmin=0;
        int cmax=0;
        for(char ch:s.toCharArray()){
            if(ch=='('){
                cmin++;
                cmax++;
            }else if(ch==')'){
                cmin--;
                cmax--;
            }
            else if(ch=='*'){
                cmin--;
                cmax++;
            }
    if(cmax<0){
        return false;
    }
    if(cmin<0){
        cmin=0;
    }
    }
    return cmin==0;
}
}
