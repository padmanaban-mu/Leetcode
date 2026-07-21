class Solution {
    public boolean canAliceWin(int[] nums) {
        int single=0;
        int d=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>9){
                single+=nums[i];
            }else{
                d+=nums[i];
            }
        }
        if(single>d || d>single){
            return true;
        }
        return false;
    }
}
