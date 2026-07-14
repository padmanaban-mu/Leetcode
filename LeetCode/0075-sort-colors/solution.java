class Solution {
    public void sortColors(int[] nums) {
       int low=0,high=0,mid=0;
       for(int i=0;i<nums.length;i++){
        if(nums[i]==0){
            low++;
        }else if(nums[i]==1){
            mid++;
        }
        else{
            high++;
        }
       }
       int  index=0;
       for(int i=0;i<low;i++){
        nums[index++]=0;
       }
       for(int i=0;i<mid;i++){
        nums[index++]=1;
       }
       for(int i=0;i<high;i++){
        nums[index++]=2;
       }
     
    }
}
