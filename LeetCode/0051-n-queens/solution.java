class Solution {
    static List<String>list=new ArrayList<>();
    static List<List<String>>ans=new ArrayList<>();
    static boolean visited[][];
    public List<List<String>> solveNQueens(int n) {
        list.clear();
        ans.clear();
        visited=new boolean[n][n];
        solve(0,n);
        return ans;
    }
    public static void solve(int row,int n){
        list.clear();
        if(row==n){
            for(int i=0;i<n;i++){
                String current="";
                for(int j=0;j<n;j++){
                    if(visited[i][j]){
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
            if(!isValid(row,col,n)){
                continue;
            }
                visited[row][col]=true;
                solve(row+1,n);
                visited[row][col]=false;
            }
            return;
        }
        public static boolean isValid(int row,int col,int n){
            for(int i=0;i<row;i++){
                if(visited[i][col]){
                    return false;
                }
            }
            for(int i=row-1,j=col-1;i>=0&&j>=0;i--,j--){
                if(visited[i][j]){
                    return false;
                }
            }
            for(int i=row-1,j=col+1;i>=0&&j<n;i--,j++){
                if(visited[i][j]){
                    return false;
                }
            }
            return true;
        }
    }
