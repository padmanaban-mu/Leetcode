class Solution {
    public int[] kWeakestRows(int[][] mat, int k) {
        int arr[]=new int[mat.length];
        int row[][]=new int[mat.length][2];
        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat[0].length;j++){
                arr[i]+=mat[i][j];
            }
            row[i][0]=arr[i];
            row[i][1]=i;
        }
        Arrays.sort(row,(a,b)->{
        if(a[0]!=b[0]){
            return a[0]-b[0];
        }
        else{
            return a[1]-b[1];
        }
        });
        int arr1[]=new int[k];
        for(int i=0;i<k;i++){
            arr1[i]=row[i][1];
        }
        return arr1;
    }
}
