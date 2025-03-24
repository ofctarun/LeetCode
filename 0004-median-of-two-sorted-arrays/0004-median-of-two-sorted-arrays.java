class Solution {
    public double findMedianSortedArrays(int[] L, int[] R) {
        int i=0,j=0,k=0;
        int[] arr = new int[L.length+R.length];
        while (i < L.length && j < R.length ) {
            if (L[i] <= R[j]) {
                arr[k] = L[i];
                i++;
            }
            else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }

        // Copy remaining elements of L[] if any
        while (i < L.length) {
            arr[k] = L[i];
           i++;
            k++;
        }

        // Copy remaining elements of R[] if any
        while (j < R.length) {
            arr[k] = R[j];
            j++;
            k++;
        }
        if((L.length+R.length)%2==1){
            double ans=arr[(L.length+R.length)/2];
            return ans;
        }
        else{
            int x=(L.length+R.length)/2;
            double anss=(arr[x]+arr[x-1]);
            return anss/2;
        }
    }
}