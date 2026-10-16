class Solution {
    public int removeDuplicates(int[] nums) {
       int left=1;
       int right=1;
       int count=0;
       while(right<nums.length){
        if(nums[right]==nums[right-1]){
            count++;
        }else{
            count=0;
        }
        if(count<2){
            nums[left]=nums[right];
            left++;
        }
        right++;
       }
       return left;
    }
}
