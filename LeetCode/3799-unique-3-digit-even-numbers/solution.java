class Solution {
    static HashSet<String>ans=new HashSet<>();
   
    public int totalNumbers(int[] digits) {
     ans.clear();
     int n=digits.length;
     boolean used[]=new boolean[n];
     findSolution(digits,n,3,used,new StringBuilder());
     return ans.size();
    }
    public static void findSolution(int digits[],int n,int k,boolean used[],StringBuilder current){
        if(current.length()==k && (current.charAt(2)-'0')%2==0){
            ans.add(current.toString());
            return;
        }
        for(int i=0;i<n;i++){
            if(used[i]){
                continue;
            }
            if(current.length()==0 && digits[i]==0){
                continue;
            }
            if(current.length()==2 && digits[i]%2!=0){
                continue;
            }
            used[i]=true;
            current.append(digits[i]);
            findSolution(digits,n,k,used,current);
            current.deleteCharAt(current.length()-1);
            used[i]=false;
        }
    }
}
