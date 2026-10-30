class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
      HashSet<Integer>set=new HashSet<>();
      HashSet<Integer> result = new HashSet<>();
      for(int i:nums1){
        set.add(i);
      }
      for(int i:nums2){
        if(set.contains(i)){
            result.add(i);
        }
      }
      int arr[]=new int[result.size()];
      int i=0;
      for(int element:result){
        arr[i]=element;
        i++;
      }
      return arr;
    }
}
