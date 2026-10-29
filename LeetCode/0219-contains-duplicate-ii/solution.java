class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashMap<Integer,ArrayList<Integer>>map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            map.putIfAbsent(nums[i],new ArrayList<>());
            map.get(nums[i]).add(i);
        }
        for(ArrayList<Integer> list:map.values()){
            if(list.size()>1){
                for(int j=0;j<list.size()-1;j++){
                    if(Math.abs(list.get(j)-list.get(j+1))<=k){
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
