class Solution {
    public int compress(char[] chars) {
     int left=0;
     int right=0;
     int count=0;
     String current="";
     while( right <chars.length){
        if(chars[left]==chars[right]){
            count++;
        right++;
        }else{
            current+=chars[left];
            if(count>1){
                current+=count;
            }
            count=0;
            left=right;   
        }
     }
     current+=chars[left];
     if(count>1){
        current+=count;
     }  
     

        for (int i = 0; i <current.length(); i++) {
            chars[i] = current.charAt(i);
        }
     return current.length(); 
    }
}
