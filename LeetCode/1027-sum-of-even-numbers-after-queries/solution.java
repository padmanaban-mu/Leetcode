class Solution {
    public int[] sumEvenAfterQueries(int[] nums, int[][] queries) {
        int len=queries.length;
        int ans[]=new int[len];
        int k=0;
        for(int i=0;i<len;i++){
            int value=queries[i][0];
            int index=queries[i][1];
            nums[index]+=value;
            int sum=0;
            for(int j:nums){
                if(j%2==0){
                    sum+=j;
                }
            }
            ans[k++]=sum;
        }
        return ans;
    }
}
