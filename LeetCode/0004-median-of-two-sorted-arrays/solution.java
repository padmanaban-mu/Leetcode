class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
       double merge[]=new double[nums1.length+nums2.length];
        for(int i=0;i<nums1.length;i++){
            merge[i]=(double)nums1[i];
        }
        for(int i=0;i<nums2.length;i++){
            merge[nums1.length+i]=(double)nums2[i];
        }
        Arrays.sort(merge);
        if(merge.length%2!=0){
            return  merge[merge.length/2];
        }else{
            return ((merge[merge.length/2]+merge[merge.length/2-1])/2);
        }
    }
}
