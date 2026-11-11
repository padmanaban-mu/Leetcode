class Solution {
    public int[] leftRightDifference(int[] nums) {
          int prefSum[]=new int[nums.length+1];
          for(int i=0;i<nums.length;i++){
            prefSum[i+1]=prefSum[i]+nums[i];
          }
          for(int i=0;i<nums.length;i++){
            int leftSum=prefSum[i];
            int rightSum=prefSum[nums.length]-prefSum[i+1];
            nums[i]=Math.abs(leftSum-rightSum);
          }
          return nums;
    }
}
