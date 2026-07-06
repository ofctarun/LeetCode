class Solution {
    public int removeCoveredIntervals(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> 
            a[0] == b[0] ? b[1] - a[1] : a[0] - b[0]
        );
        int max = 0, ans = 0;
        for(int[] interval : intervals){
            if(max < interval[1]){
                ans++;
                max = interval[1];
            }
        }
        return ans;
    }
}