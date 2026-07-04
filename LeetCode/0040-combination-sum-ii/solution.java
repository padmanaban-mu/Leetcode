class Solution {
    static ArrayList<List<Integer>>ans=new ArrayList<>();
    static ArrayList<Integer>list=new ArrayList<>();
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        list.clear();
        ans.clear();
        findSolution(0,0,candidates,target);
        return ans;
    }
    public static void findSolution(int index,int currentSum,int[]candidates,int target){
        if(currentSum==target){
            ans.add(new ArrayList<>(list));
            return;
        }
        if(index>=candidates.length||currentSum>target){
            return;
        }
        list.add(candidates[index]);
        findSolution(index+1,currentSum+candidates[index],candidates,target);
        list.remove(list.size()-1);
        while(index+1<candidates.length && candidates[index]==candidates[index+1]){
            index++;
        }
        findSolution(index+1,currentSum,candidates,target);
        }
}
