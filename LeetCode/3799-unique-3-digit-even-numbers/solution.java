class Solution {
    static HashSet<String>ans=new HashSet<>();
   
    public int totalNumbers(int[] digits) {
        ans.clear();
        boolean used[]=new boolean[digits.length];
        findSolution(digits,used,new StringBuilder(),3);
        return ans.size();
    }
    public static void findSolution(int []digits,boolean []used,StringBuilder current,int k){
        if(current.length()==k&& (current.charAt(2)-'0')%2==0){
            ans.add(current.toString());
            return;
        }
       for(int i=0;i<digits.length;i++){
        if(used[i]){
            continue;
        }
        if(current.length()==0 && digits[i]==0){
            continue;
        }
         if (current.length() == 2 && digits[i] % 2 != 0) {
                continue;
            }
        used[i]=true;
        current.append(digits[i]);
        findSolution(digits,used,current,k);
        current.deleteCharAt(current.length()-1);
        used[i]=false;
    }
}
}
