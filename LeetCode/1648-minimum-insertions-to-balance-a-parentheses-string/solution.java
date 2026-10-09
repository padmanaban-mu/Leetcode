class Solution {
    public int minInsertions(String s) {
        StringBuilder sb=new StringBuilder(s);
        int n=s.length();
    int open=0,insert=0;
        for(int i=0;i<n;i++){
            if(s.charAt(i)=='('){
               open++;
            }else {
                if(i+1<n &&s.charAt(i+1)==')'){
                    i++;
                }else{
                    insert++;
                }
                if(open>0){
                    open--;
                }else{
                    insert++;
                }
            }
    }
    return insert+(open*2);
}
}
