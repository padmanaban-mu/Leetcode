class Solution {
    static int m;
    static int n;
    public int[][] highestPeak(int[][] isWater) {
        m=isWater.length;
        n=isWater[0].length;
       return bfs(isWater);
       
   }
    public static int[][] bfs(int[][] grid){
        int [][]distance=new int[m][n];
        boolean [][]visited=new boolean[m][n];
        Queue<int[]>queue=new LinkedList<>();
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j]==1){
                    queue.add(new int[]{i,j});
                    visited[i][j]=true;
                }
            }
        }
        while(!queue.isEmpty()){
            int current[]=queue.poll();
            int i=current[0];
            int j=current[1];
           if(i+1<m&&!visited[i+1][j]){
                visited[i+1][j]=true;
                distance[i+1][j]=distance[i][j]+1;
                queue.add(new int[]{i+1,j});
            }
            if(i-1>=0&&!visited[i-1][j]){
                visited[i-1][j]=true;
                distance[i-1][j]=distance[i][j]+1;
                queue.add(new int[]{i-1,j});
            }
            if(j+1<n&&!visited[i][j+1]){
                visited[i][j+1]=true;
                distance[i][j+1]=distance[i][j]+1;
                queue.add(new int[]{i,j+1});
            }
            if(j-1>=0&&!visited[i][j-1]){
                visited[i][j-1]=true;
                distance[i][j-1]=distance[i][j]+1;
                queue.add(new int[]{i,j-1});
            }
        }
        return distance;
    }
}
