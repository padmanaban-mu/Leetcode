class Solution {
    public void rotate(int[] nums, int k) {
        int j=0;
        for(int i=0;i<k%nums.length;i++){
            int temp=nums[nums.length-1];
            for( j=nums.length-1;j>0;j--){
                nums[j]=nums[j-1];
            }
            nums[0]=temp;
        }
    }
}