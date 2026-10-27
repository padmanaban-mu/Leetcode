class Solution {
    public int openLock(String[] deadends, String target) {
        HashSet<String>visited=new HashSet<>();
        for(String i: deadends){
            visited.add(i);
        }
        Queue<String>queue=new LinkedList<>();
        String start="0000";
        if(visited.contains(start)){
            return -1;
        }
        queue.add(start);
        visited.add(start);

        int moves=0;
        while(!queue.isEmpty()){
            int size=queue.size();
            while(size-->0){
                String word=queue.poll();
                if(word.equals(target)){
                    return moves;
                }
                for(int i=0;i<4;i++){
                char ch[]=word.toCharArray();
                    if(ch[i]=='9'){
                        ch[i]='0';
                    }else{
                        ch[i]++;
                    }
                    String up=new String(ch);
                    if(!visited.contains(up)){
                        visited.add(up);
                        queue.add(up);
                    }
                    ch=word.toCharArray();
                    if(ch[i]=='0'){
                        ch[i]='9';
                    }else{
                        ch[i]--;
                    }
                    String down=new String(ch);
                    if(!visited.contains(down)){
                        visited.add(down);
                        queue.add(down);
                    }
                }
            }
            moves++;
        }
        return -1;
    }
}
