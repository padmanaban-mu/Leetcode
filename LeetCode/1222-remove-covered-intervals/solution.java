class Solution {
    public int removeCoveredIntervals(int[][] intervals) {
        Arrays.sort(intervals,(a,b)->
        {
            if(a[0]==b[0]){
                return b[1]-a[1];
            }
            return a[0]-b[0];
        }
        );
    int count=0;
      int current[]=intervals[0];
      for(int i=1;i<intervals.length;i++){
        if(intervals[i][1]<=current[1]){
            count++;
        }else{
            current=intervals[i];
        }
      }
      return intervals.length-count;
    }
}
