class Solution {
    public int totalFruit(int[] fruits) {
        int left=0,right=0,max=0,distinct=0;
        int freq[]=new int[fruits.length];
        while(left<fruits.length && right<fruits.length){
            if(freq[fruits[right]]==0){
                distinct++;
            }
            freq[fruits[right]]++;
            while(distinct>2){
                freq[fruits[left]]--;
                if(freq[fruits[left]]==0){
                    distinct--;
                }
                left++;
            }
            max=Math.max(max,right-left+1);
            right++;
        }
        return max;
    }
}
