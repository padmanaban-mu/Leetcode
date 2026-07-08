class Solution {
    public boolean judgeCircle(String moves) {
     int count1=0;
     int count2=0;
        for(int k=0;k<moves.length();k++){
        if(moves.charAt(k)=='R'){
            count1++;
        }
        if(moves.charAt(k)=='U'){
            count2++;
        }
        if(moves.charAt(k)=='D'){
            count2--;
        }
        if(moves.charAt(k)=='L'){
            count1--;
        }
        }
        if(count1==0 &&count2==0){
            return true;
        }
        return false;
    }
}
