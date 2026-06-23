class Solution {
    public int[] findErrorNums(int[] nums) {
            ArrayList<Integer>list=new ArrayList<>();
            int count[]=new int[nums.length+1];
            for(int i=0;i<nums.length;i++){
               count[nums[i]]++;
            }
            int duplicates=0,missing=0;
            for(int i=1;i<=nums.length;i++){
                if(count[i]==2){
                    duplicates=i;
                }else if(count[i]==0){
                    missing=i;
                }
            }
            return new int[]{duplicates,missing};
    }
}
