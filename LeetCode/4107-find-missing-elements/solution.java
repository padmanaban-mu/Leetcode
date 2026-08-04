class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        int min=Integer.MAX_VALUE;
        int max=0;
        ArrayList<Integer>list=new ArrayList<>();
        ArrayList<Integer>list1=new ArrayList<>();
        for(int i:nums){
            min=Math.min(min,i);
            max=Math.max(max,i);
            list.add(i);
        }
        for(int i=min;i<=max;i++){
            if(!list.contains(i)){
                list1.add(i);
            }
        }
        return list1;
    }
}
