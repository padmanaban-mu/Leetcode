class Solution {
    public String reverseWords(String s) {
     String input[]=s.split(" ");
    for(int i=0;i<input.length;i++){
        input[i]=Rev(input[i]);
    } 
    return String.join(" ",input);
    }
    public static String Rev(String current){
        char ch[]=current.toCharArray();
        int left=0;
        int right=ch.length-1;
        while(left<right){
            char temp=ch[left];
            ch[left]=ch[right];
            ch[right]=temp;
            left++;
            right--;
        }
    current= new String(ch);
    return current;
    }
}
