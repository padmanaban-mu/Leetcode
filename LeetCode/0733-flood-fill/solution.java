class Solution {
    static int m;
    static int n;
    static int originalColor;
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        m=image.length;
        n=image[0].length;
       originalColor=image[sr][sc];
        if(originalColor==color){
            return image;
        }
        findSolution(image,sr,sc,color);
        return image;
    }
    public static void findSolution(int [][]image,int srcx,int srcy,int color){
       boolean visited[][]=new boolean[m][n];
       Queue<int[]>queue=new LinkedList<>();
       queue.add(new int[]{srcx,srcy});
       visited[srcx][srcy]=true;
       image[srcx][srcy]=color;
       while(!queue.isEmpty()){
        int current[]=queue.poll();
        int i=current[0];
        int j=current[1];
       
        if(i+1<m&&image[i+1][j]==originalColor&&!visited[i+1][j]){
            image[i+1][j]=color;
            visited[i+1][j]=true;
            queue.add(new int[]{i+1,j});
        }
        if(i-1>=0&&image[i-1][j]==originalColor&&!visited[i-1][j]){
            image[i-1][j]=color;
            visited[i-1][j]=true;
            queue.add(new int[]{i-1,j});
        }
        if(j+1<n&&image[i][j+1]==originalColor&&!visited[i][j+1]){
            image[i][j+1]=color;
            visited[i][j+1]=true;
            queue.add(new int[]{i,j+1});
        }
        if(j-1>=0&&image[i][j-1]==originalColor&&!visited[i][j-1]){
            image[i][j-1]=color;
            visited[i][j-1]=true;
            queue.add(new int[]{i,j-1});
        }
       }
    }
}
