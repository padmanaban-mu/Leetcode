class Solution {
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        HashSet<String>set=new HashSet<>();
        for(String i:wordList){
            set.add(i);
        }
        int level=1;
        Queue<String>queue=new LinkedList<>();
        queue.add(beginWord);
        while(!queue.isEmpty()){
            int size=queue.size();
            while(size-->0){
                String current=queue.poll();
                if(current.equals(endWord)){
                    return level;
                }
                char words[]=current.toCharArray();
                for(int i=0;i<words.length;i++){
                    char original=words[i];
                    for(char c='a';c<='z';c++){
                        words[i]=c;
                        String next=new String(words);
                        if(set.contains(next)){
                            queue.add(next);
                            set.remove(next);
                        }
                    }
                    words[i]=original;
                }

            }
            level++;
        }
        return 0;
    }
}
