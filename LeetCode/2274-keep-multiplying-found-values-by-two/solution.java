class Solution {
    public int findFinalValue(int[] nums, int original) {
        while(true){
            boolean found=false;
        for(int i:nums){
            if(i==original){
                original=2*original;
                found=true;
            }
        }
        if(!found){
           break;
        }
        }
        return original;
    }
}
