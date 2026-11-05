class Solution {
    public int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
        int distance=0;
        for(int i:arr1){
        int count=0;
            for(int j:arr2){
                if(Math.abs(i-j)>d){
                    count++;
                }
            }
            if(count==arr2.length){
                distance++;
            }
        }
        return distance;
    }
}
