class Solution {
    public int smallestIndex(int[] nums) {
        int min=Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++){
            if(sum(nums[i])==i){
                min=Math.min(min,i);
            }
        }
        if(min!=Integer.MAX_VALUE){
            return min;
        }else{
            return -1;
        }
    }
    public static int sum(int num){
        // int n=num;
        // int digits=0;
        // while(n-->0){
        //     digits++;
        //     n/=10;
        // }
        int sum=0;
        while(num>0){
            int rem=num%10;
            sum+=rem;
            num/=10;
        }
        return sum;
    }
}
