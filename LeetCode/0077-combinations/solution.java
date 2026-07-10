class Solution {
    static ArrayList<List<Integer>>ans=new ArrayList<>();
    static ArrayList<Integer>list=new ArrayList<>();
    public List<List<Integer>> combine(int n, int k) {
        ans.clear();
        list.clear();
        combinations(1,n,k);
        return ans;
    }
    public static void combinations(int index,int n,int k){
        if(list.size()==k){
            ans.add(new ArrayList<>(list));
            return;
        }
        for(int i=index;i<=n;i++){
            list.add(i);
            combinations(i+1,n,k);
            list.remove(list.size()-1);
        }
    }
}
