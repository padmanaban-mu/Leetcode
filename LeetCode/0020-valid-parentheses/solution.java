class Solution {
   public boolean isValid(String s) {
    int len=s.length();
    if(len%2!=0){
        return false;
    }
   
    char stack[]=new char[len/2];
    int head=0;
    for(char ch:s.toCharArray()){
        if(ch=='('){
      if(head>=len/2){
        return false;
      }
            stack[head++]=')';
        }else if(ch=='{'){
      if(head>=len/2){
        return false;
      }
            stack[head++]='}';
        }
        else if(ch=='['){
      if(head>=len/2){
        return false;
      }
            stack[head++]=']';
        }else {
            if(head==0||stack[--head]!=ch){
                return false;
            }
        }
    }
    return head==0;
   }
}
        
