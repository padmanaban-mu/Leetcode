class Solution {
    public int mostFrequentEven(int[] nums) {
        LinkedHashMap<Integer,Integer>map=new LinkedHashMap<>();
        for(int i=0;i<nums.length;i++){
            if(nums[i]%2==0){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        }
        ArrayList<Integer>list=new ArrayList<>();
        int max=0;
        for(Map.Entry<Integer,Integer>e:map.entrySet()){
            if(e.getValue()>max){
                max=e.getValue();
            }
        }
        for(Map.Entry<Integer,Integer>e:map.entrySet()){
            if(e.getValue()==max){
                if(!list.contains(e.getKey())){
                list.add(e.getKey());
                }
            }
        }
        int min=Integer.MAX_VALUE;
        for(int i:list){
            if(min>i){
                min=i;
            }
        }
        if(min!=Integer.MAX_VALUE){
        return min;
        }
        return -1;
    }
}
