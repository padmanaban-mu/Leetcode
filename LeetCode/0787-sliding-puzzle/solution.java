class Solution {
    public int slidingPuzzle(int[][] board) {
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<2;i++){
            for(int j=0;j<3;j++){
                sb.append(board[i][j]);
            }
        }
        return bfs(sb.toString());
    }
    public static int bfs(String start){
        String target="123450";
        Queue<String>q=new LinkedList<>();
        HashMap<String,Integer>dist=new HashMap<>();
        q.add(start);
        dist.put(start,0);
        while(!q.isEmpty()){
            String curr=q.poll();
            if(curr.equals(target)){
                return dist.get(curr);
            }
            int zero=curr.indexOf('0');
            int row=zero/3;
            int col=zero%3;
            if(row>0){
                int next=zero-3;
                addState(curr,next,zero,q,dist);
            }
            if(row<1){
                  int next=zero+3;
                addState(curr,next,zero,q,dist);
            }
            if(col>0){
                  int next=zero-1;
                addState(curr,next,zero,q,dist);
            }
            if(col<2){
                  int next=zero+1;
                addState(curr,next,zero,q,dist);
            }
        }
        return -1;
    }
    public static void addState(String curr,int next,int zero,Queue<String>q,HashMap<String,Integer>dist){
        char []arr=curr.toCharArray();
        char temp=arr[zero];
        arr[zero]=arr[next];
        arr[next]=temp;
        String state=new String(arr);
        if(!dist.containsKey(state)){
            dist.put(state,dist.get(curr)+1);
            q.add(state);
        }
    }
}
