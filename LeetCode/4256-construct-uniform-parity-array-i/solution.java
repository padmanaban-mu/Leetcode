class Solution {
    public boolean uniformArray(int[] nums1) {
        int n=nums1.length;
       int nums2[]=new int[nums1.length];
       for(int i=0;i<n;i++){
        if(nums1[i]%2==0){
           nums2[i]=nums1[i];
        }else{
            for(int j=0;j<n;j++){
                if(Math.abs(nums1[i]-nums1[j])%2==0 && j!=i){
                    nums2[i]=nums1[i]-nums1[j];
                }
            }
        }
       }
       for(int i=0;i<n;i++){
        if(nums1[i]%2!=0){
            nums2[i]=nums1[i];
        }else{
            for(int j=0;j<n;j++){
                if(Math.abs(nums1[i]-nums1[j])%2!=0 && j!=i){
                    nums2[i]=nums1[i]-nums1[j];
                }
            }
        }
       }
       int a=0,b=0;
       for(int i=0;i<n;i++){
        if(nums2[i]%2==0){
            a++;
        }else{
            b++;
        }
       }
       if(a==n||b==n){
        return true;
       }
       return false;
    }
}

/*
1) if array has atleast one odd element means it will make other even elements by nums[i]-num(odd elemenbt)=odd only(follows, even-odd=odd)
 so it will make enetire array to odd array

2)if array is itself has no odd an donly even then it s even array.

*/
