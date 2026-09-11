class Solution {
    static int m;
    static int n;
    public void solve(char[][] board) {
        m=board.length;
        n=board[0].length;
        if(m==0||n==0){
            return;
        }
        for(int i=0;i<m;i++){
            findSolution(board,i,0,m,n);
            findSolution(board,i,n-1,m,n);
        }
        for(int j=0;j<n;j++){
            findSolution(board,0,j,m,n);
            findSolution(board,m-1,j,m,n);
        }
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(board[i][j]=='O'){
                    board[i][j]='X';
                }
                else if(board[i][j]=='#'){
                    board[i][j]='O';
                }
            }
        }
    }
    public static void findSolution(char[][]board,int i,int j,int m,int n){
        if(i<0||j<0||i>=m||j>=n||board[i][j]!='O'){
            return;
        }
        board[i][j]='#';
        findSolution(board,i+1,j,m,n);
        findSolution(board,i,j+1,m,n);
        findSolution(board,i,j-1,m,n);
        findSolution(board,i-1,j,m,n);
    }
}
