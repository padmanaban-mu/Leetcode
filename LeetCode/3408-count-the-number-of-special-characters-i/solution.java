class Solution {
    public int numberOfSpecialChars(String word) {
        Set<Character>set=new HashSet<>();
        for(char ch:word.toCharArray()){
            char upper=Character.toUpperCase(ch);
            if(Character.isLowerCase(ch) && word.contains(upper+"")){
                set.add(ch);
            }
        }
        return set.size();
    }
}
