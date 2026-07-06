class Solution {
    public boolean carPooling(int[][] trips, int capacity) {
        int diff[]=new int[1001];
        for(int i=0;i<trips.length;i++){
            int passenger=trips[i][0];
            int start=trips[i][1];
            int end=trips[i][2];
            diff[start]+=passenger;
            diff[end]-=passenger;
        }
        int current=0;
        for(int i=0;i<diff.length;i++){
            current+=diff[i];
            if(current>capacity){
                return false;
            }
       }
       return true;
    }
}
