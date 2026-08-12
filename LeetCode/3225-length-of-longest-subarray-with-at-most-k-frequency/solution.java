class Solution {
    public int maxSubarrayLength(int[] nums, int k) {
        int left=0,right=0,max=0;
        LinkedHashMap<Integer,Integer>map=new LinkedHashMap<>();
       
        while(right<nums.length){
           map.put(nums[right],map.getOrDefault(nums[right],0)+1);
          while(map.get(nums[right])>k){
            map.put(nums[left],map.get(nums[left])-1);
          left++;
           }
            max=Math.max(max,right-left+1);
                right++;
        }
        return max;
    }
}
