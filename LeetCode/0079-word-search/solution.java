class Solution {
    static int m;
    static int n;
    static boolean solution[][];
  
  public static boolean exist(char[][] board, String word) {
   m=board.length;
   n=board[0].length;
   solution=new boolean[m][n];
       for(int i=0;i<m;i++){
for(int j=0;j<n;j++){
    if( findSolution(i,j,board,word,0)){
        return true;
    }
       }
       }
        return false;
    }
 static boolean findSolution(int i,int j,char[][]board,String word,int index){
    if(i<0 ||i>=m || j<0 ||j>=n ||solution[i][j]==true){
        return false;
    }
    if(board[i][j]!=word.charAt(index)){
        return false;
    }
    if(index==word.length()-1){
        return true;
    }
    solution[i][j]=true;
    if(findSolution(i+1,j,board,word,index+1)){
        return true;
    }
    if(findSolution(i,j+1,board,word,index+1)){
        return true;
    }
    if(findSolution(i-1,j,board,word,index+1)){
        return true;
    }
    if(findSolution(i,j-1,board,word,index+1)){
        return true;
    }
    solution[i][j]=false;
    return false;
}
    }
