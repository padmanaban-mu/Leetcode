class Solution {
    static ArrayList<Integer>list=new ArrayList<>();
    static ArrayList<List<Integer>>ans=new ArrayList<>();
    public List<List<Integer>> subsets(int[] nums) {
        list.clear();
        ans.clear();
        findSolution(nums,0);
        return ans;
    }
    public static void findSolution(int nums[],int index){
        // if(!ans.contains(list)){
            ans.add(new ArrayList<>(list));
       // }
        for(int i=index;i<nums.length;i++){
            list.add(nums[i]);
            findSolution(nums,i+1);
            list.remove(list.size()-1);
        }
    }
}
