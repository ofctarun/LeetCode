class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int temp[] = new int[m+n];
        int i = 0,j = 0,idx = 0;
        while(i<m && j<n){
            if(nums1[i] < nums2[j]){
                temp[idx] = nums1[i++];
            }
            else{
                temp[idx] = nums2[j++];
            }
            idx++;
        }
        while(i<m){
            temp[idx++] = nums1[i++];
        }
        while(j<n){
            temp[idx++] = nums2[j++];
        }
        System.arraycopy(temp,0,nums1,0,temp.length);
    }
}