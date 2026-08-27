class Solution {
    public List<Integer> majorityElement(int[] nums) {
        ArrayList<Integer>list=new ArrayList<>();
        LinkedHashMap<Integer,Integer>map=new LinkedHashMap<>();
        for(int i=0;i<nums.length;i++){
         map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        
        int size=nums.length/3;
       for(Map.Entry<Integer,Integer>e:map.entrySet()){
            if(e.getValue()>size){
                if(!list.contains(e.getKey())){
                list.add(e.getKey());
                }
            }
        }
        return list;
    }
}
