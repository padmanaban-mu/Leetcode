class Solution {
        static ArrayList<ArrayList<Integer>>ans=new ArrayList<>();
        static ArrayList<Integer>list=new ArrayList<>();
        static boolean visited[];
    public boolean validPath(int n, int[][] edges, int source, int destination) {
    ans.clear();
    list.clear();
        for(int i=0;i<n;i++){
            ans.add(new ArrayList<>());
        }
        visited=new boolean[n];
        int m=edges.length;
        for(int i=0;i<m;i++){
            int u=edges[i][0];
            int v=edges[i][1];
            ans.get(u).add(v);
            ans.get(v).add(u);
        }
        dfs(source);
        if(!list.contains(destination)){
            return false;
        }
        return true;
        }
        public static void dfs(int node){
            visited[node]=true;
            list.add(node);
            for(int neighbour:ans.get(node)){
                if(!visited[neighbour]){
                    dfs(neighbour);
                }
            }
        }
    }
