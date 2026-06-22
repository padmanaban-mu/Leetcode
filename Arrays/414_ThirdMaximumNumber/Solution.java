class Solution {
    public int thirdMax(int[] nums) {
        ArrayList<Integer>list=new ArrayList<>();
        for(int i:nums){
            if(list.contains(i)){
                continue;
            }else{
                list.add(i);
            }
        }
        Collections.sort(list);
        Collections.sort(list,Collections.reverseOrder());

        if(list.size()>=3){
            return list.get(2);
        }
        else if(list.size()==2||list.size()==1){
            return list.get(0);
        }
        return -1;
    }
}