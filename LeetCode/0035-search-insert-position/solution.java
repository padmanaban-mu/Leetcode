class Solution {
    public int searchInsert(int[] nums, int target) {
      int low=0;
      int mid=0;
    boolean flag=false;
      int high=nums.length-1;
      while(low<=high){
        mid=(low+high)/2;
        if(nums[mid]==target){
            flag=true;
            return mid;
        }
        if(nums[mid]>target){
           high=mid-1;
        }
        if(nums[mid]<target){
           low=mid+1;
        }
      }
    //   if(!flag){
    //     if(nums[mid]<target){
    //         return mid+1;
    //    }
    //    else{
    //     return low;
    //    }
    //   }
      return low;
    }
}
