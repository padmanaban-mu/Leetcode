class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        int [][] arr=new int[intervals.length+1][2];
        for(int i=0;i<intervals.length;i++){
            arr[i][0]=intervals[i][0];
            arr[i][1]=intervals[i][1];
        }
        arr[intervals.length][0]=newInterval[0];
        arr[intervals.length][1]=newInterval[1];
        Arrays.sort(arr,(a,b)-> a[0]-b[0]);
        int current[]=arr[0];
        ArrayList <int[]>list=new ArrayList<>();
        for(int i=1;i<arr.length;i++){
            if(arr[i][0]<=current[1]){
                current[1]=Math.max(arr[i][1],current[1]);
            }else{
                list.add(current);
                current=arr[i];
                
            }
        }
      
    list.add(current);
    int array[][]=new int[list.size()][2];
    for(int i=0;i<list.size();i++){
        array[i][0]=list.get(i)[0];
        array[i][1]=list.get(i)[1];
    }
    return array;
    }
}
