class Solution {
    public double findMaxAverage(int[] nums, int k) {
        if(nums.length==1){
            return nums[0];
        }
        double max=0.0;
        double sum=0;
        for(int i=0;i<k;i++){
            sum+=nums[i];
        }
        max=sum;
       
        for(int i=k;i<nums.length;i++){
            sum-=nums[i-k];
            sum+=nums[i];
            max=Math.max(max,sum);
        }
        return max/k;
    }
}
