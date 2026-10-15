class Solution {
    public int nearestExit(char[][] maze, int[] entrance) {
        Queue<int[]>queue=new LinkedList<>();
        int m=maze.length;
        int n=maze[0].length;
        boolean visited[][]=new boolean[m][n];
        queue.add(new int[]{entrance[0],entrance[1]});
        visited[entrance[0]][entrance[1]]=true;
        int distance[][]=new int[m][n];
        distance[entrance[0]][entrance[1]]=0;
        while(!queue.isEmpty()){
            int current[]=queue.poll();
            int i=current[0];
            int j=current[1];
            if((i==0 ||j==0||i==m-1||j==n-1) &&!(i==entrance[0] &&j==entrance[1])){
                return distance[i][j];
            }
            if(i+1<m && maze[i+1][j]!='+'&&!visited[i+1][j]){
                distance[i+1][j]=distance[i][j]+1;
                visited[i+1][j]=true;
                int num=i+1;
                // if(num==m-1){
                //     return distance[i+1][j];
                // }
                queue.add(new int[]{i+1,j});
            }
            if(i-1>=0 && maze[i-1][j]!='+'&&!visited[i-1][j]){
                distance[i-1][j]=distance[i][j]+1;
                visited[i-1][j]=true;
                int num=i-1;
                // if(num==0){
                //     return distance[i-1][j];
                // }
                queue.add(new int[]{i-1,j});
            }
            if(j+1<n && maze[i][j+1]!='+'&&!visited[i][j+1]){
                distance[i][j+1]=distance[i][j]+1;
                visited[i][j+1]=true;
                int num=j+1;
                // if(num==n-1){
                //     return distance[i][j+1];
                // }
                queue.add(new int[]{i,j+1});
            }
            if(j-1>=0 && maze[i][j-1]!='+'&&!visited[i][j-1]){
                distance[i][j-1]=distance[i][j]+1;
                visited[i][j-1]=true;
                int num=j-1;
                // if(num==0){
                //     return distance[i][j-1];
                // }
                queue.add(new int[]{i,j-1});
            }
        }
        return -1;
    }
}
