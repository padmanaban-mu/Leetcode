class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        long sum=0,max=0;
        int distinct=0;
        int count[]=new int[100008];
        for(int i=0;i<k;i++){
           sum+=nums[i];
           if(count[nums[i]]==0){
            distinct++;
           }
           count[nums[i]]++;
        }
        if(distinct==k){
            max=sum;
        }
        for(int i=k;i<nums.length;i++){
        sum-=nums[i-k];
        count[nums[i-k]]--;
        if(count[nums[i-k]]==0){
            distinct--;
        }
          sum+=nums[i];
           if(count[nums[i]]==0){
            distinct++;
           }
           count[nums[i]]++;
           if(distinct==k){
            if(sum>max){
            max=sum;
           }
           }
        }
        return max;
    }
}
