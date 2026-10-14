class Solution {
    public boolean stoneGame(int[] piles) {
        int alice=0;
        int bob=0;
        int left=0;
        int right=piles.length-1;
        int i=0;
        while(left<right){
            if(i%2==0){
            if(piles[left]>=piles[right]){
                alice+=piles[left];
                left++;
            }else if(piles[left]<piles[right]){
                alice+=piles[right];
                right--;
            }
        }else{
             if(piles[left]>=piles[right]){
                bob+=piles[left];
                left++;
            }else if(piles[left]<piles[right]){
                bob+=piles[right];
                right--;
            }
        }
    }
    return alice>bob;
    }
}
