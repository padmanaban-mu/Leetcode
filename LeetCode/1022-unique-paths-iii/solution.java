class Solution {
    static int m;
    static int n;
    static int destx;
    static int desty;
    static int count=0;
    public int uniquePathsIII(int[][] grid) {
        int srcx=0;
    int srcy=0;
    m=grid.length;
    n=grid[0].length;
    boolean visited[][]=new boolean[m][n];
    int empty=0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j]==1){
                    srcx=i;
                    srcy=j;
                }
                else if(grid[i][j]==0){
                    empty++;
                }
            }
        }
     return findSolution(srcx,srcy,grid,visited,empty);
      
    }
    public static int findSolution(int i,int j,int grid[][],boolean visited[][],int empty){
        if(i<0 ||i>=m||j<0||j>=n||grid[i][j]==-1||visited[i][j]==true){
            return 0;
        }
        if(grid[i][j]==2 && empty==-1){
           
            return 1;
           
        }
        visited[i][j]=true;
       
       int total=  findSolution(i+1,j,grid,visited,empty-1) +
        findSolution(i,j+1,grid,visited,empty-1) +
        findSolution(i-1,j,grid,visited,empty-1) +
        findSolution(i,j-1,grid,visited,empty-1);
        visited[i][j]=false;
     
        return total;
    }
}
