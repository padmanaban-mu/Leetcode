class Solution {
    public int maximumProduct(int[] nums) {
        Arrays.sort(nums);
        int first=nums[nums.length-1];
        int second=nums[nums.length-2];
        int third=nums[nums.length-3];
       int max1=first*second*third;
       first=nums[0];
       second=nums[1];
   
       int max2=first*second*nums[nums.length-1];
       return Math.max(max1,max2);
    }
}
