class Solution {
    public String[] createGrid(int m, int n) {
        char [][]grid=new char[m][n];
        for(int i=0;i<m;i++){
            Arrays.fill(grid[i],'#');
        }
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(j==0 ||i==m-1){
                    grid[i][j]='.';
                }
            }
        }
        String[] str = new String[m];
        for (int i = 0; i < m; i++) {
            str[i] = new String(grid[i]);
        }
        return str;
    }
}
