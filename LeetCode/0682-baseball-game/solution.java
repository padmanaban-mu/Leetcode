class Solution {
    public int calPoints(String[] operations) {
        ArrayList<Integer>list=new ArrayList<>();
        for(int i=0;i<operations.length;i++){
            if(operations[i].equals("C")){
                list.remove(list.size()-1);
            }else if(operations[i].equals("D")){
                int num=list.get(list.size()-1);
                list.add(num*2);
            }else if(operations[i].equals("+")){
                int num1=list.get(list.size()-1);
                int num2=list.get(list.size()-2);
                list.add(num1+num2);
            }
            else{
                list.add(Integer.parseInt(operations[i]));
            }
        }
        int sum=0;
        for(int i=0;i<list.size();i++){
            sum+=list.get(i);
        }
        return sum;
    }
}
