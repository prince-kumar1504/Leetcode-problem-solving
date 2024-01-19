class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        
        int n1 = nums1.length;
        int n2 = nums2.length;
        
        int n3 = n1+n2;
        int[]  arr = new int[n3];
        
        int p1 = 0; 
        int p2 = 0;
        for(int i = 0 ; i< n3 ; i++){
            if(p1 < n1 && (p2 >= n2 || nums1[p1] <= nums2[p2])){
                arr[i] = nums1[p1];
                p1++;
            }else if (p2 < n2){
                arr[i] = nums2[p2];
                p2++;
            }
        }
        double ans = 0; 
        if(n3%2==0) {
            ans = (arr[n3/2-1] + arr[n3/2])/2.0; 
        }else{
            ans = arr[n3/2]/1.0;
}
        return ans;
        
    }
}
