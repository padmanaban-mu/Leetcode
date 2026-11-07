class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        int count=0;
        Set<Character> jewelSet = new HashSet<>();
        for (char j : jewels.toCharArray()) {
            jewelSet.add(j);
        }
        for(char ch:stones.toCharArray()){
            if(jewelSet.contains(ch)){
                count++;
            }
        }
        return count;
    }
}
