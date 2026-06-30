class Solution {
    public int titleToNumber(String columnTitle) {
        int sum=0,i=0;
        while(i<columnTitle.length()){
            sum=26*sum+(columnTitle.charAt(i)-'A')+1;
            i++;
        }
        return sum;
    }
}
