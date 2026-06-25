import java.util.*;
class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        ArrayList<Integer>list=new ArrayList<>();
        ArrayList<Integer>list1=new ArrayList<>();
        for(int i=0;i<nums1.length;i++){
            list.add(nums1[i]);
        }

        for(int i=0;i<nums2.length;i++){
            if(list.contains(nums2[i])){
                if(!list1.contains(nums2[i])){
                    list1.add(nums2[i]);
                }
            }
        }
        int arr[]=new int[list1.size()];
        for(int i=0;i<list1.size();i++){
            arr[i]=list1.get(i);
        }
        return arr;
    }
}
