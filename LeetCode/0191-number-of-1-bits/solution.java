class Solution {
    public int hammingWeight(int n) {
        String binary="";
        while(n>0){
            binary=n%2+binary;
            n/=2;
        }
        int sum=0;
        for(int i=0;i<binary.length();i++){
            sum+=binary.charAt(i)-'0';
        }
        return sum;
    }
}
