class Solution {
    public int integerReplacement(int n) {
        Queue<Long>q=new LinkedList<>();
        HashMap<Long,Integer>dist=new HashMap<>();
        q.add((long)n);
        dist.put((long)n,0);
        while(!q.isEmpty()){
           long curr=q.poll();
            if(curr==1){
                return dist.get(curr);
            }
            if(curr%2==0){
              long num=curr/2;
                if(!dist.containsKey(num)){
                    dist.put(num,dist.get(curr)+1);
                    q.add(num);
                }
            }else{
                long num=curr+1;
                if(!dist.containsKey(num)){
                    dist.put(num,dist.get(curr)+1);
                    q.add(num);
                }
               long num1=curr-1;
                if(!dist.containsKey(num1)){
                    dist.put(num1,dist.get(curr)+1);
                    q.add(num1);
                }
            }
        }
        return -1;
    }
}
