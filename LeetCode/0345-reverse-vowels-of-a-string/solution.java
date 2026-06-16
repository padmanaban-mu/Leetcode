class Solution {
    public String reverseVowels(String s) {
        String vowels="aeiouAEIOU";
        char ch[]=s.toCharArray();
        int i=0;
        int j=ch.length-1;
while(i<j){
    if(!vowels.contains(ch[i]+"")){
        i++;
    }else if(!vowels.contains(ch[j]+"")){
        j--;
    }
    else{
        char temp=ch[i];
        ch[i]=ch[j];
        ch[j]=temp;
        i++;
        j--;
    }
      }      String str=new String(ch);
      return str;
    }
}
