class Solution {
    public boolean carPooling(int[][] trips, int capacity) {
        int[] freq = new int[1001];
        for(int[] trip : trips){
            freq[trip[1]] += trip[0];
            freq[trip[2]] -= trip[0];
        }
        int c = 0;
        for(int num : freq){
            c += num;
            if(c > capacity)return false;
        }
        return true;
    }
}