class Solution {
    static int m;
    static int n;
    public int shortestPathBinaryMatrix(int[][] grid) {
        m=grid.length;
        n=grid[0].length;
        if(grid[0][0]==1){
            return -1;
        }
        return bfs(grid,0,0);
    }
    public static int bfs(int [][]grid,int srcx,int srcy){
        boolean visited[][]=new boolean[m][n];
        Queue<int[]>queue=new LinkedList<>();
        int distance[][]=new int[m][n];
        distance[srcx][srcy]=0;
        visited[srcx][srcy]=true;
        queue.add(new int[]{srcx,srcy});
        while(!queue.isEmpty()){
            int current[]=queue.poll();
            int i=current[0];
            int j=current[1];
            if(i==m-1 && j==n-1 && grid[i][j]!=1){
                return distance[i][j]+1;
            }
            if(i+1<m && grid[i+1][j]==0 && !visited[i+1][j]){
    visited[i+1][j]=true;
    distance[i+1][j]=distance[i][j]+1;
    queue.add(new int[]{i+1,j});
}

if(i-1>=0 && grid[i-1][j]==0 && !visited[i-1][j]){
    visited[i-1][j]=true;
    distance[i-1][j]=distance[i][j]+1;
    queue.add(new int[]{i-1,j});
}

if(j+1<n && grid[i][j+1]==0 && !visited[i][j+1]){
    visited[i][j+1]=true;
    distance[i][j+1]=distance[i][j]+1;
    queue.add(new int[]{i,j+1});
}

if(j-1>=0 && grid[i][j-1]==0 && !visited[i][j-1]){
    visited[i][j-1]=true;
    distance[i][j-1]=distance[i][j]+1;
    queue.add(new int[]{i,j-1});
}

if(i+1<m && j+1<n && grid[i+1][j+1]==0 && !visited[i+1][j+1]){
    visited[i+1][j+1]=true;
    distance[i+1][j+1]=distance[i][j]+1;
    queue.add(new int[]{i+1,j+1});
}

if(i+1<m && j-1>=0 && grid[i+1][j-1]==0 && !visited[i+1][j-1]){
    visited[i+1][j-1]=true;
    distance[i+1][j-1]=distance[i][j]+1;
    queue.add(new int[]{i+1,j-1});
}

if(i-1>=0 && j+1<n && grid[i-1][j+1]==0 && !visited[i-1][j+1]){
    visited[i-1][j+1]=true;
    distance[i-1][j+1]=distance[i][j]+1;
    queue.add(new int[]{i-1,j+1});
}

if(i-1>=0 && j-1>=0 && grid[i-1][j-1]==0 && !visited[i-1][j-1]){
    visited[i-1][j-1]=true;
    distance[i-1][j-1]=distance[i][j]+1;
    queue.add(new int[]{i-1,j-1});
}
    }
    return -1; 
}
}
