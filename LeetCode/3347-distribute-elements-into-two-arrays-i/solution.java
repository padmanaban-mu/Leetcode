class Solution {
    public int[] resultArray(int[] nums) {
        ArrayList<Integer>list1=new ArrayList<>();
        ArrayList<Integer>list2=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            if(list1.isEmpty()){
                list1.add(nums[i]);
            }else{
                if(list2.isEmpty()){
                    list2.add(nums[i]);
                }else if(list1.get(list1.size()-1)>list2.get(list2.size()-1)){
                    list1.add(nums[i]);
                }
                else{
                    list2.add(nums[i]);
                }
                }
            }
            for(int i=0;i<list2.size();i++){
                list1.add(list2.get(i));
            }
            for(int i=0;i<list1.size();i++){
                nums[i]=list1.get(i);
            }
            return nums;
    }
}
