class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int arr:nums){
            map.put(arr,map.getOrDefault(arr,0)+1);
        }
        for(int key:map.keySet()){
            if(map.get(key)>=2){
                return true;
            }
        }
        return false;
    }
}
