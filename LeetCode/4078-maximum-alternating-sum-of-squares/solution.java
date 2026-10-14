class Solution {
    public long maxAlternatingSum(int[] nums) {
        for(int i=0;i<nums.length;i++){
            nums[i]=nums[i]*nums[i];
        }
        int sub=nums.length/2;
        Arrays.sort(nums);
        long sum=0;
        long sum1=0;
        int i=0;
        while(i<sub){
            sum+=nums[i];
            i++;
        }
        while(i<nums.length){
            sum1+=nums[i];
            i++;
        }
        return sum1-sum;
    }
}
