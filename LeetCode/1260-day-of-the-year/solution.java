class Solution {
    public int dayOfYear(String date) {
        LinkedHashMap<Integer,Integer>map=new LinkedHashMap<>();
        int year=Integer.parseInt(date.substring(0,4));
        int month=Integer.parseInt(date.substring(5,7));
        int digit=Integer.parseInt(date.substring(8,10));
        int days[]={0,31,28,31,30,31,30,31,31,30,31,30,31};
        if(year%4==0 && year%100!=0 ||year%400==0){
            days[2]=29;
        }
        int totaldays=digit;
        for(int i=0;i<month;i++){
            totaldays+=days[i];
        }
        return totaldays;
    }
}
