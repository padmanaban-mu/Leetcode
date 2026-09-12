class Solution {
    static int max;
    public int getMaximumGold(int[][] grid) {
        max=0;
        int m=grid.length;
        int n=grid[0].length;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
        findSolution(grid,i,j,m,n,0);
    }
        }
        return max;
    }
        public static void findSolution(int [][]grid,int i,int j,int m,int n,int gold){
            if(i<0||j<0||i>=m||j>=n||grid[i][j]==0){
                return;
            }
            gold+=grid[i][j];
            if(gold>max){
                max=gold;
            }
            int temp=grid[i][j];
            grid[i][j]=0;
            findSolution(grid,i+1,j,m,n,gold);
            findSolution(grid,i,j+1,m,n,gold);
            findSolution(grid,i-1,j,m,n,gold);
            findSolution(grid,i,j-1,m,n,gold);
            grid[i][j]=temp;
        }
}
