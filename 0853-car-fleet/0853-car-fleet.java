class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        int n = position.length, ans = 0;
        Integer[] sorted = new Integer[n];
        for(int i = 0; i < n; i++)sorted[i] = i;
        Arrays.sort(sorted, (a, b) -> Integer.compare(position[b], position[a]));
        double curr = -1;
        for(int i : sorted){
            double time = (double)(target - position[i]) / speed[i];
            if(curr < time){
                curr = time;
                ans++;
            }
        }
        return ans;
    }
}