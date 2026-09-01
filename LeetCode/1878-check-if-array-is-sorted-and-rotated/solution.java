class Solution {
    public boolean check(int[] nums) {
        int arr[]=nums.clone();
        Arrays.sort(arr);
        int x=0;
        boolean found=false;
        int b[]=new int [arr.length];
        while(x<arr.length){
            for(int i=0;i<arr.length;i++){
                b[i]=arr[(i+x)%arr.length];
            }
            if(Arrays.equals(nums,b)){
                found=true;
                break;
            }
            x++;
        }
        return found;
    }
}
