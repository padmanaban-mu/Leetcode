class Solution {
    public int shortestPathLength(int[][] graph) {
        int n=graph.length;
        if(n==0){
            return 0;
        }
        int target=(1<<n)-1;
        return bfs(graph,n,target);
}
public static int bfs(int [][]graph,int n,int target){
    Queue<int[]>queue=new LinkedList<>();
    boolean visited[][]=new boolean[n][1<<n];
        for(int i=0;i<n;i++){
            int mask=1<<i;
            queue.add(new int[]{i,mask,0});
            visited[i][mask]=true;
        }
        while(!queue.isEmpty()){
            int state[]=queue.poll();
            int current=state[0];
            int mask=state[1];
            int dist=state[2];
            if(mask==target){
                return dist;
            }
            for(int i:graph[current]){
                int newMask=mask |(1<<i);
                if(!visited[i][newMask]){
                    visited[i][newMask]=true;
                    queue.add(new int[]{i,newMask,dist+1});
                }
            }
        }
        return -1;
}
}
