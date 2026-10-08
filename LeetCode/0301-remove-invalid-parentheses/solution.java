class Solution {
    public List<String> removeInvalidParentheses(String s) {
     List<String>result=new ArrayList<>();
     Set<String>visited=new HashSet<>();
     Queue<String>queue=new LinkedList<>();
     queue.add(s);
     visited.add(s);
    boolean found=false;
     while(!queue.isEmpty()){
        int size=queue.size();
        while(size-->0){
        String current=queue.poll();
        if(isValid(current)){
            result.add(current);
            queue.add(current);
            found=true;
        }
        if(found){
            continue;
        }
        for(int i=0;i<current.length();i++){
            if(s.charAt(i)!='(' && s.charAt(i)!=')'){
                continue;
            }
            String next=current.substring(0,i)+current.substring(i+1);
            if(!visited.contains(next)){
                visited.add(next);
                queue.add(next);
            }
        }
     }
     if(found){
        break;
     }
    }
    return result;
    }

    public static boolean isValid(String str){
        int balance=0;
        for(char ch:str.toCharArray()){
            if(ch=='('){
                balance++;
            }else if(ch==')'){
                balance--;

if(balance<0){
    return false;
}            }
        }
        return balance==0;
    }
}
