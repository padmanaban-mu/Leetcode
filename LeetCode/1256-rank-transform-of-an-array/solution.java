class Solution {
    public int[] arrayRankTransform(int[] arr) {
       int arr1[]= new int[arr.length];
       for(int i=0;i<arr.length;i++){
        arr1[i]=arr[i];
       }
        Arrays.sort(arr1);
        LinkedHashMap<Integer,Integer>map=new LinkedHashMap<>();
        int rank=1;
        for(int i=0;i<arr1.length;i++){
            if(!map.containsKey(arr1[i])){
                map.put(arr1[i],rank++);
            }
        }
        for(int i=0;i<arr.length;i++){
            // if(map.containsKey(arr[i])){
                arr1[i]=map.get(arr[i]);
            // }
        }
        return arr1;
    }
}
