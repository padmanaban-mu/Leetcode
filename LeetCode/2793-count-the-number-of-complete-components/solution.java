class Solution {
    public int countCompleteComponents(int n, int[][] edges) {
        ArrayList<ArrayList<Integer>>graph=new ArrayList<>();
        for(int i=0;i<n;i++){
            graph.add(new ArrayList<>());
        }
        int m=edges.length;
        int e=0;
        int  sum=0;
        while(e<m){
            int edge[]=edges[e++];
            int u=edge[0];
            int v=edge[1];
           graph.get(u).add(v);
           graph.get(v).add(u);
        }
        int c=0;
        boolean visited[]=new boolean[n];
        for(int i=0;i<n;i++){
            if(!visited[i]){
            ArrayList<Integer>comp=new ArrayList<>();
            isConnected(graph,i,visited,comp);
            if(isComplete(graph,comp)){
                c++;
            }
            }
        }
        return c;
    }
    public static void isConnected(ArrayList<ArrayList<Integer>>graph,int start,boolean visited[],ArrayList<Integer>component){
        Queue<Integer>queue=new LinkedList<>();
        queue.add(start);
        visited[start]=true;
        while(!queue.isEmpty()){
            int current=queue.poll();
            component.add(current);
           for(int i:graph.get(current)){
                    if(!visited[i]){
                        visited[i]=true;
                        queue.add(i);
                    }
                }
            }
    }
    public static boolean isComplete(ArrayList<ArrayList<Integer>>graph,ArrayList<Integer>component){
        int size=component.size();
        for(int i:component){
            if(graph.get(i).size()!=size-1){
                return false;
            }
        }
        return true;
    }
}
