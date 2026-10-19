class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        int sCount=0;
        int targetCount=0;
        for(int i:nums){
            if(i<target){
                sCount++;
            }
            if(i==target){
                targetCount++;
            }
        }
        List<Integer>result=new ArrayList<>();
        for(int i=0;i<targetCount;i++){
            result.add(sCount+i);
        }
        return result;
    }
}
