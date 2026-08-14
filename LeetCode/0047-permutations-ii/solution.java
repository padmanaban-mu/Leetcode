class Solution {
   static ArrayList<Integer>list=new ArrayList<>();
    static ArrayList<List<Integer>>ans=new ArrayList<>();
    static int n;
    public List<List<Integer>> permuteUnique(int[] nums) {
        ans.clear();
        list.clear();
        n=nums.length;
        boolean []visited=new boolean[n];
        // Arrays.sort(nums);
        findSolution(nums,visited);
        return ans;
    }
    public static void findSolution(int nums[],boolean []visited){
        if(list.size()==n){
            if(!ans.contains(list)){
            ans.add(new ArrayList<>(list));
        }
            return;
        }
        for(int i=0;i<n;i++){
            if(visited[i]){
                continue;
            }
            visited[i]=true;
            list.add(nums[i]);
            findSolution(nums,visited);
            list.remove(list.size()-1);
           visited[i]=false;
        }
    }
}
