class Solution {
    static int m;
    static int n;
    static int totalPaths=0;
    public int uniquePathsIII(int[][] grid) {
        m=grid.length;
        n=grid[0].length;
        int empty=0;
        int srcx=0;
        int srcy=0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j]==1){
                    srcx=i;
                    srcy=j;
                }
                if(grid[i][j]==0){
                    empty++;
                }
            }
        }
        findSolutions(grid,srcx,srcy,empty);
        return totalPaths;
    }
    public static int findSolutions(int [][]grid,int i,int j,int empty){
        if(i<0||i>=m||j<0||j>=n||grid[i][j]==-1){
            return 0;
        }
        if(grid[i][j]==2 &&empty==-1){
            return 1;
        }
        int temp=grid[i][j];
        grid[i][j]=-1;
        totalPaths=findSolutions(grid,i+1,j,empty-1)+findSolutions(grid,i,j+1,empty-1)+findSolutions(grid,i-1,j,empty-1)+findSolutions(grid,i,j-1,empty-1);
        grid[i][j]=temp;
        return totalPaths;
    }
}
