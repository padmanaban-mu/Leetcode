class Solution {
   public boolean isValid(String s) {
    int balance=0;
    StringBuilder sb=new StringBuilder(s);
    for(int i=1;i<sb.length();i++){
        if(i==0){
            continue;
        }
        char current=sb.charAt(i);
        char prev=sb.charAt(i-1);
        if((current==')' && prev=='(')||(current==']' && prev=='[')||(current=='}' && prev=='{')){
            sb.deleteCharAt(i);
            sb.deleteCharAt(i-1);
            i-=2;
        }
    }
    return sb.length()==0;
   }
}
