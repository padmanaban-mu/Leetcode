class Solution {
  
    static int m;
    static int n;
    public int maxAreaOfIsland(int[][] grid) {
    int max=0;
        m=grid.length;
        n=grid[0].length;
       
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j]==1){
                 max=Math.max(max,findSolution(grid,i,j,0));
                }
            }
        }
        return max;
    }
    public static int findSolution(int[][]grid,int i,int j,int count){
        if(i<0||j<0||i>=m||j>=n||grid[i][j]==0){
            return 0;
        }
        grid[i][j]=0;
       
       return 1+findSolution(grid,i+1,j,count)+findSolution(grid,i-1,j,count)+findSolution(grid,i,j+1,count)+findSolution(grid,i,j-1,count);
    }
}
