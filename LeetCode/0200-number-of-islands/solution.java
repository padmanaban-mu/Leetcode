class Solution {
    static int m;
    static int n;
    static boolean visited[][];
    public int numIslands(char[][] grid) {
        m=grid.length;
        n=grid[0].length;
        visited=new boolean[m][n];
        int count=0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j]=='1' &&!visited[i][j]){
                    count++;
                    findSolution(i,j,grid);
                }
            }
        }
        return count;
    }
    public static void findSolution(int i,int j,char [][]grid){
        if(i<0||j<0||i>=m||j>=n||grid[i][j]=='0'||visited[i][j]){
            return;
        }
       visited[i][j]=true;
       findSolution(i+1,j,grid);
       findSolution(i,j+1,grid);
       findSolution(i-1,j,grid);
       findSolution(i,j-1,grid);
       return;
    }
}
