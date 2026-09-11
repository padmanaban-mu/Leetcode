class Solution {
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        int n=rooms.size();
        boolean visited[]=new boolean[n];
        dfs(rooms,0,visited);
     
        for(boolean i:visited){
            if(!i){
               return false;
            }
        }
        return true;
    }
    public static void dfs(List<List<Integer>>graph,int node,boolean visited[]){
        visited[node]=true;
       for(int neighbour:graph.get(node)){
        if(!visited[neighbour]){
            dfs(graph,neighbour,visited);
        }
       }
    }
}
