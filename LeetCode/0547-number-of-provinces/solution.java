class Solution {
    public int findCircleNum(int[][] isConnected) {
        int m=isConnected.length;
        int n=isConnected[0].length;
        int count=0;
      
        boolean visited[]=new boolean[m];
        for(int i=0;i<m;i++){
            if(!visited[i]){
                count++;
                dfs(isConnected,i,visited,m);
            }
        }
        return count;
    }
    public static void dfs(int[][]isConnected,int city,boolean visited[],int m){
        visited[city]=true;
        for(int j=0;j<m;j++){
            if(isConnected[city][j]==1 &&!visited[j]){
                dfs(isConnected,j,visited,m);
            }
        }
    }
}

    
        
