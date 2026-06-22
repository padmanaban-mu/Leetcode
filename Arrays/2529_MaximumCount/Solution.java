class Solution {
    public int maximumCount(int[] nums) {
        int a=0,b=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>0){
                a++;
            }else{
                if(nums[i]<0){
                    b++;
                }
            }
        }
        int max=Math.max(a,b);
        return max;
    }
}