class Solution {
    static ArrayList<List<String>>ans=new ArrayList<>();
       static ArrayList<String>list=new ArrayList<>();
    static int[][]chess;
    static boolean [][]visited;
    public List<List<String>> solveNQueens(int n) {
        ans.clear();
        list.clear();
       chess=new int[n][n];
       visited=new boolean[n][n];
       findSolution(0,n);
       return ans;
    }
    public static void findSolution(int row,int n){
        list.clear();
        if(row==n){
            for(int i=0;i<n;i++){
                String current="";
                for(int j=0;j<n;j++){
                    if(visited[i][j]==true){
                        current+="Q";
                    }else{
                        current+=".";
                    }
                }
                list.add(current);
            }
            if(!ans.contains(list)){
            ans.add(new ArrayList<>(list));
        }
            return;
        }
        for(int col=0;col<n;col++){
            if(!isSafe(row,col,n)){
                continue;
            }
        visited[row][col]=true;
        findSolution(row+1,n);
        visited[row][col]=false;
        }
        return;
    }
    public static boolean isSafe(int row,int col,int n){
       for(int i=0;i<row;i++){
            if(visited[i][col]==true){
                return false;
            }
        }
        for(int i=row-1,j=col-1;i>=0&&j>=0;i--,j--){
            if(visited[i][j]==true){
                return false;
            }
        }
        for(int i=row-1,j=col+1;i>=0&&j<n;i--,j++){
            if(visited[i][j]==true){
                return false;
            }
        }
        return true;
    }
}
