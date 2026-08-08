class Solution {
    static ArrayList<String> list=new ArrayList<>();
        static LinkedHashMap<Character,String>map=new LinkedHashMap<>();
    public List<String> letterCombinations(String digits) {
        list.clear();
        map.put('2',"abc");
        map.put('3',"def");
        map.put('4',"ghi");
        map.put('5',"jkl");
        map.put('6',"mno");
        map.put('7',"pqrs");
        map.put('8',"tuv");
        map.put('9',"wxyz");
        findSolutions(digits,0,new StringBuilder());
        return list;
    }
    public static void findSolutions(String digits,int currentIndex, StringBuilder current){
        if(currentIndex==digits.length()){
            list.add(current.toString());
            return;
        }
        char ch=digits.charAt(currentIndex);
        String str=map.get(ch);
        if(str!=null){
            for(int i=0;i<str.length();i++){
                current.append(str.charAt(i));
                findSolutions(digits,currentIndex+1,current);
                current.deleteCharAt(current.length()-1);
            }
        }
    }
}
