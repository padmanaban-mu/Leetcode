class Solution {
    public String maxSumOfSquares(int num, int sum) {
        StringBuilder sb=new StringBuilder();
        int rem=sum;
        for(int i=0;i<num;i++){
            int digit=Math.min(9,rem);
            sb.append(digit);
            rem-=digit;
           
        }
        if(rem!=0){
            return "";
        }
        return sb.toString();
    }
}
