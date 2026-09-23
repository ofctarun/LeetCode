class Solution {
    boolean binarySearch(int[] arr, int target){
        int low = 0, high = arr.length - 1;
        while(low <= high){
            int mid = low + (high - low)/2;
            if(arr[mid] == target)return true;
            else if(arr[mid] < target)low = mid + 1;
            else high = mid - 1;
        }
        return false;
    }
    public boolean searchMatrix(int[][] matrix, int target) {
        int low = 0, high = matrix.length - 1;
        int n = matrix[0].length - 1;
        while(low <= high){
            int mid  = low + (high - low)/2;
            if(matrix[mid][n] == target)return true;
            else if(matrix[mid][n] < target)low = mid + 1;
            else high = mid - 1;
        }
        if(low >= matrix.length)return false;
        return binarySearch(matrix[low], target);
    }
}