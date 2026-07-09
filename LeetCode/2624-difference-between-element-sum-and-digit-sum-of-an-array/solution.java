class Solution {
        static int sum=0;
    public int differenceOfSum(int[] nums) {
        int a=findSum(nums);
        int b=digitSum(nums);
        return Math.abs(a-b);
    }
    public static int findSum(int arr[]){
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
        }
        return sum;
    }
    public static int digitSum(int arr[]){
        int dsum=sum;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>9){
                dsum-=arr[i];
                while(arr[i]>0){
                    dsum+=arr[i]%10;
                    arr[i]/=10;
                }
            }
        }
        return dsum;
    }
}
