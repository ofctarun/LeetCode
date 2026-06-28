class Solution {
    public int maximumElementAfterDecrementingAndRearranging(int[] arr) {
        Arrays.sort(arr);
        arr[0] = 1;
        int curr = 1;
        for(int i = 1; i < arr.length; i++)curr = (arr[i] - curr > 1) ? curr + 1 : arr[i];
        return curr;
    }
}