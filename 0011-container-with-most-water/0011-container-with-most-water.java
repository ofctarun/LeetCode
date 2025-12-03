class Solution {
    public int maxArea(int[] heights) {
        int start = 0;
        int end = heights.length - 1;
        int result = 0;
        while(start < end){
            int h = Math.min(heights[start], heights[end]);
            int w = end - start;
            result = Math.max(result, h*w);
            if(heights[start] > heights[end]){
                end--;
            }else{
                start++;
            }
        }
        return result;
    }
}
