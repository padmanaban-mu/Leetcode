class Solution {
    public int minimumDeletions(int[] nums) {
    int minimum=Integer.MAX_VALUE;
        int minE=Integer.MAX_VALUE;
        int minI=0;
        int maxE=Integer.MIN_VALUE;
        int maxI=0;
        for(int i=0;i<nums.length;i++){
          if(nums[i]<minE){
            minE=nums[i];
            minI=i;
          }
          if(nums[i]>maxE){
            maxE=nums[i];
            maxI=i;
          }
        }
        int iterate1=0;
        int iterate2=0;
        if(maxI>minI){
            iterate1=minI;
            iterate2=maxI;
        }else{
            iterate1=maxI;
            iterate2=minI;
        }
        minimum=Math.min(minimum,findCount1(iterate1,iterate2));
        minimum=Math.min(minimum,findCount2(iterate1,iterate2,nums));
        minimum=Math.min(minimum,find(iterate1,iterate2,nums));
        return minimum;
    }
    public static int find(int a,int b,int nums[]){
        int count=0;
            count+=a+1;
            count+=nums.length-b;
            return count;
    }
    public static int findCount1(int a,int b){
        int count=0;
         for(int i=0;i<=b;i++){
            count++;
        }
        return count;
    }
    public static int findCount2(int a,int b,int nums[]){
        int count=0;
        for(int i=nums.length-1;i>=a;i--){
            count++;
        }
        return count;
    }
}
