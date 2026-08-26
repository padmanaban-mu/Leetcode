class Solution {
    public int missingMultiple(int[] nums, int k) {
        HashSet<Integer>set=new HashSet<>();
        int max=0;
        for(int i:nums){
            set.add(i);
            max=Math.max(max,i);
        }
        List<Integer>list=new ArrayList<>();
        for(int i=0;i<=max+1;i++){
            int mul=k*i;
            list.add(mul);
        }
        for(int i=1;i<=list.size();i++){
            if(set.contains(list.get(i))){
                continue;
            }
            return list.get(i);
        }
        return -1;
    }
}
