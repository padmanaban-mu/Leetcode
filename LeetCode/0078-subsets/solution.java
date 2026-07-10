class Solution {
    static ArrayList<Integer>list=new ArrayList<>();
    static ArrayList<List<Integer>>ans=new ArrayList<>();
    public List<List<Integer>> subsets(int[] nums) {
        list.clear();
        ans.clear();
      
	    findSolution(0,nums);
	   return ans;
    }
	public static void findSolution(int index,int nums[]){
	    if(index==nums.length){
	    ans.add(new ArrayList<>(list));
	    return;
	    }
	    list.add(nums[index]);
	        findSolution(index+1,nums);
	        list.remove(list.size()-1);
	        findSolution(index+1,nums);
	    }
}
