class Solution {
    static ArrayList<List<Integer>>ans=new ArrayList<>();
    static ArrayList<Integer>list=new ArrayList<>();
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        ans.clear();
        list.clear();
            Arrays.sort(nums);
        findSolution(0,nums);
        return ans;
    }
    public static void findSolution(int index,int []nums){
        if(index==nums.length){
            if(!ans.contains(list)){
            ans.add(new ArrayList<>(list));
            }
            return;
        }
        
            list.add(nums[index]);
            findSolution(index+1,nums);
            list.remove(list.size()-1);
            findSolution(index+1,nums);
        }
    }

