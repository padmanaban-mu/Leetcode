class Solution {
    static ArrayList<List<Integer>>ans=new ArrayList<>();
    static ArrayList<Integer>list=new ArrayList<>();
    public List<List<Integer>> permute(int[] nums) {
        ans.clear();
        list.clear();
        boolean []used=new boolean[nums.length];
        permutations(nums,used);
        return ans;
    }
    public static void permutations(int[]nums,boolean []used){
        if(list.size()==nums.length){
            ans.add(new ArrayList<>(list));
            return;
        }
        for(int i=0;i<nums.length;i++){
            if(used[i]){
                continue;
            }
            used[i]=true;
            list.add(nums[i]);
            permutations(nums,used);
            list.remove(list.size()-1);
            used[i]=false;
        }
    }
}
