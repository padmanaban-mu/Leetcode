class Solution {
    public boolean canAliceWin(int n) {
     boolean canWin=false;
     int remove=10;
     while(n>=remove){
      
        n-=remove;
        canWin=!canWin;
        remove--;
      }
     return canWin;
    }
}
