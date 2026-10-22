class Solution {
    public int openLock(String[] deadends, String target) {
        HashSet<String>dead=new HashSet<>();
        for(String i: deadends){
            dead.add(i);
        }
        HashMap<String,Integer>dist=new HashMap<>();
        Queue<String>q=new LinkedList<>();
        if(dead.contains("0000")){
            return -1;
        }
        q.add("0000");
        dist.put("0000",0);
        while(!q.isEmpty()){
            String curr=q.poll();
            if(curr.equals(target)){
                return dist.get(curr);
            }
            for(int i=0;i<4;i++){
                char arr[]=curr.toCharArray();
                if(arr[i]=='9'){
                    arr[i]='0';
                }else{
                    arr[i]++;
                }
                String up=new String(arr);
                if(!dead.contains(up) && !dist.containsKey(up)){
                    dist.put(up,dist.get(curr)+1);
                    q.add(up);
                }
                arr=curr.toCharArray();
                 if(arr[i]=='0'){
                    arr[i]='9';
                }else{
                    arr[i]--;
                }
                 String down=new String(arr);
                if(!dead.contains(down) && !dist.containsKey(down)){
                    dist.put(down,dist.get(curr)+1);
                    q.add(down);
                }
            }
        }
        return -1;
    }
}
