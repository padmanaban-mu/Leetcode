class Solution {
    public int minimumRecolors(String blocks, int k) {
        int min=Integer.MAX_VALUE;
        int whites=0;
        for(int i=0;i<k;i++){
            if(blocks.charAt(i)=='W'){
                whites++;
            }
        }
            min=Math.min(min,whites);
        for(int i=k;i<blocks.length();i++){
            if(blocks.charAt(i-k)=='W'){
                whites--;
            }
            if(blocks.charAt(i)=='W'){
                whites++;
            }
            min=Math.min(min,whites);
        }
        return min;
    }
}
