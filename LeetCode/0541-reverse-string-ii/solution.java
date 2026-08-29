class Solution {
    public String reverseStr(String s, int k) {
        StringBuilder sb=new StringBuilder(s);
        int len=s.length();
        for (int i = 0; i < len; i += 2 * k) {
            int left = i;
            int right = Math.min(i + k - 1, len - 1);
            while (left < right) {
                char tempLeft = sb.charAt(left);
                char tempRight = sb.charAt(right);
                
                sb.setCharAt(left, tempRight);
                sb.setCharAt(right, tempLeft);
                
                left++;
                right--;
            }
        }
        return sb.toString();
}
}
