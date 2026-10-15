class Solution {
    public int countMajoritySubarrays(int[] nums, int target) {
        int count=0;
        for(int i=0;i<nums.length;i++){
            ArrayList<Integer>list=new ArrayList<>();
                int t=0;
            for(int j=i;j<nums.length;j++){
                    if(nums[j]==target){
                        t++;
                    }
                int size=j-i+1;
                if(t>size/2){
                    count++;
                }
            }
        }
        return count;
    }
}
