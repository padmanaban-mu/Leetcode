class Solution {
    static int m;
    static int n;
    public int orangesRotting(int[][] grid) {
        m=grid.length;
        n=grid[0].length;
        Queue<int[]>queue=new LinkedList<>();
        int fresh=0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j]==2){
                    queue.add(new int[]{i,j});
                }else if(grid[i][j]==1){
                    fresh++;
                }
            }
        }
        int minutes=0;
        while(!queue.isEmpty() && fresh>0){
            int size=queue.size();
            for(int k=0;k<size;k++){
                int current[]=queue.poll();
                int i=current[0];
                int j=current[1];
                if(i+1<m&&grid[i+1][j]==1){
                    grid[i+1][j]=2;
                    fresh--;
                    queue.add(new int[]{i+1,j});
                }
                if(i-1>=0&&grid[i-1][j]==1){
                    grid[i-1][j]=2;
                    fresh--;
                    queue.add(new int[]{i-1,j});
                }
                if(j+1<n&&grid[i][j+1]==1){
                    grid[i][j+1]=2;
                    fresh--;
                    queue.add(new int[]{i,j+1});
                }
                if(j-1>=0&&grid[i][j-1]==1){
                    grid[i][j-1]=2;
                    fresh--;
                    queue.add(new int[]{i,j-1});
                }
            }
            minutes++;
        }
        if(fresh>0){
            return -1;
    }else{
        return minutes;
    }
    }
}

