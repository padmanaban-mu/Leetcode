class Solution {
    public int findGCD(int[] nums) {
        int min=Integer.MAX_VALUE,max=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]<min){
                min=nums[i];
            }
            if(nums[i]>max){
                max=nums[i];
            }
        }
        return find(min,max);
    }
    public static int find(int a,int b){
        if(b==0){
            return a;
        }
        return find(b,a%b);
    }
}
