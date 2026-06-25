class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        ArrayList<Integer>list=new ArrayList<>();
        int len=0;
        if(s.length()>p.length()){
            len=p.length();
        }else{
            len=s.length();
        }
        int arr[]=new int[26];
        for(int i=0;i<p.length();i++){
            arr[p.charAt(i)-'a']++;
        }
        int arr2[]=new int[26];
        int k=0;
        for(int i=0;i<len;i++){
            arr2[s.charAt(i)-'a']++;
        }
        if(Arrays.equals(arr,arr2)){
            list.add(k);
        }
        for(int i=len;i<s.length();i++){
            arr2[s.charAt(i-len)-'a']--;
            arr2[s.charAt(i)-'a']++;
            k++;
            if(Arrays.equals(arr,arr2)){
                list.add(k);
            }
        }
 return list;       
    }
}
