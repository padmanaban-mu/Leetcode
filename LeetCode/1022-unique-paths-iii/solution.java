class Solution {
    static int srcx;
    static int srcy;
    static int m;
    static int n;
    public int uniquePathsIII(int[][] grid) {
        m=grid.length;
        n=grid[0].length;
        int empty=0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j]==1){
                    srcx=i;
                    srcy=j;
                }else if(grid[i][j]==0){
                    empty++;
                }
            }
        }
        return countWays(srcx,srcy,grid,empty);
    }
    public static int countWays(int i,int j,int [][]grid,int empty){
        if(i<0||i>=m||j<0||j>=n||grid[i][j]==-1){
            return 0;
        }
        if(grid[i][j]==2 &&empty==-1){
            return 1;
        }
        int temp=grid[i][j];
        grid[i][j]=-1;
        int total=countWays(i+1,j,grid,empty-1)+
                countWays(i,j+1,grid,empty-1)+
                countWays(i-1,j,grid,empty-1)+
                countWays(i,j-1,grid,empty-1);
                grid[i][j]=temp;
                return total;
    }
}
