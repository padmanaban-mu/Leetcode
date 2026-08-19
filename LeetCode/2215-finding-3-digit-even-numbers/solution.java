class Solution {
    static HashSet<String>list=new HashSet<>();
    public int[] findEvenNumbers(int[] digits) {
        list.clear();
        boolean used[]=new boolean[digits.length];
        findSolution(digits,used,new StringBuilder(),3);
        int arr[]=new int[list.size()];
        int i=0;
        for(String s:list){
            arr[i++]=Integer.parseInt(s);
        }
        Arrays.sort(arr);
        return arr;
    }
    public static void findSolution(int []digits,boolean[]used,StringBuilder current,int k){
        if(current.length()==k){
          String value = current.toString();

    if (!list.contains(value)) {
        list.add(value);
    }
    return;
        }
        for(int i=0;i<digits.length;i++){
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
            findSolution(digits,used,current,k);
            current.deleteCharAt(current.length()-1);
            used[i]=false;
        }
    }
}
