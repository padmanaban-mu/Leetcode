class Solution {
        static ArrayList<ArrayList<Integer>>ans=new ArrayList<>();
        static boolean visited[];
    public boolean validPath(int n, int[][] edges, int source, int destination) {
    ans.clear();
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
        return dfs(source,destination);
        }
        public static boolean dfs(int node,int end){
            visited[node]=true;
            if(node==end){
                return true;
            }
            
            for(int neighbour:ans.get(node)){
                if(!visited[neighbour]){
                    if(dfs(neighbour,end)){
                        return true;
                    }
                }
            }
            return false;
        }
    }
