class Solution {
    static int m;
    static int n;
    static int count;
    public boolean exist(char[][] board, String word) {
        m=board.length;
        n=board[0].length;
        boolean soln[][]=new boolean[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(findSolution(i,j,board,word,soln,0)){
                    return true;
                }
            }
        }
        return false;
    }
    public static boolean findSolution(int i,int j,char[][]board,String word,boolean[][] soln,int index){
        if(i<0 ||i>=m ||j<0 ||j>=n|| soln[i][j]==true){
            return false;
        }
        if(board[i][j]!=word.charAt(index)){
            return false;
        }
        if(index==word.length()-1){
            return true;
        }
        soln[i][j]=true;
        if(findSolution(i+1,j,board,word,soln,index+1)){
            return true;
        }
        if(findSolution(i,j+1,board,word,soln,index+1)){
            return true;
        }
        if(findSolution(i-1,j,board,word,soln,index+1)){
            return true;
        }
        if(findSolution(i,j-1,board,word,soln,index+1)){
            return true;
        }
        soln[i][j]=false;
        return false;
    }
}
