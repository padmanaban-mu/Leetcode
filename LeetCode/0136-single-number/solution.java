class Solution {
    public int singleNumber(int[] nums) {
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int arr:nums){
            map.put(arr,map.getOrDefault(arr,0)+1);
        }
        for(int key:map.keySet()){
            if(map.get(key)==1){
                return key;
            }
        }
    return -1;
    }
}
