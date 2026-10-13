class Solution {
    public int getCommon(int[] nums1, int[] nums2) {
        Set<Integer>set=new HashSet<>();
        for(int i:nums1){
            set.add(i);
        }
        int min=Integer.MAX_VALUE;
        for(int i:nums2){
            if(set.contains(i)){
                min=Math.min(min,i);
            }
        }
        if(min!=Integer.MAX_VALUE){
        return min;
        }
        return -1;
    }
}
