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
    public static void findSolution(int [][]image,int i,int j,int color){
        if(i<0||j<0||i>=m||j>=n){
            return;
        }
        if(image[i][j]!=originalColor){
            return;
        }
        image[i][j]=color;
        findSolution(image,i+1,j,color);
        findSolution(image,i-1,j,color);
        findSolution(image,i,j+1,color);
        findSolution(image,i,j-1,color);
    }
}
