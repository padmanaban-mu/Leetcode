class Solution {
    public int minimumSumSubarray(List<Integer> nums, int l, int r) {
        int min=Integer.MAX_VALUE;
        for(int i=0;i<nums.size();i++){
            ArrayList<Integer>list=new ArrayList<>();
            int sum=0;
            for(int j=i;j<nums.size();j++){
                sum+=nums.get(j);
                list.add(nums.get(j));
                if(list.size()>=l && list.size()<=r&&sum>0){
                    min=Math.min(min,sum);
                }
            }
        }
        return min==Integer.MAX_VALUE?-1:min;
    }
}
