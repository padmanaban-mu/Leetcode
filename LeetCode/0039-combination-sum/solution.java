class Solution {
      static  ArrayList<List<Integer>> ans=new ArrayList<>();
        static ArrayList<Integer> list=new ArrayList<>();
        
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        ans.clear();
        list.clear();
        find(0,0,candidates,target);
        return ans;
    }
    public static void find(int index,int currentSum,int[] candidates,int target){
        if(currentSum==target){
            ans.add(new ArrayList<>(list));
            return;
        }
        if(index>=candidates.length || currentSum > target){
            return;
        }
        list.add(candidates[index]);
        find(index,currentSum+candidates[index],candidates,target);
        list.remove(list.size()-1);
        find(index+1,currentSum,candidates,target);
    }
}
