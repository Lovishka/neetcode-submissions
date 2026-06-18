class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n=nums1.length;
        int m=nums2.length;
        int[] ans=new int[m+n];

        int i=0,j=0,idx=0;

        while(i<n && j<m){
            if(nums1[i]<=nums2[j]){
                ans[idx++]=nums1[i];
                i++;
            }
            else {
                ans[idx++]=nums2[j];
                j++;
            }
        }
        while(i<n){
            ans[idx++]=nums1[i];
            i++;
        }
        while(j<m){
            ans[idx++]=nums2[j];
            j++;
        }

        if((m+n)%2!=0){
            int val=(m+n)/2;
            return (double)ans[val];
        }
        else {
            int m1=(m+n)/2;
            int m2=((m+n)/2)-1;
            double avg=((double)ans[m1]+(double)ans[m2])/2;
            return avg;
        }
      
    }

}
