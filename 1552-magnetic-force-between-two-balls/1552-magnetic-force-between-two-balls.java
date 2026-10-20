class Solution {
    boolean check(int[] position, int dist, int m){
        int tot = 1, prev = position[0];
        for(int i = 1; i < position.length; i++){
            if(position[i] - prev >= dist){
                tot++;
                prev = position[i];
            }
            if(tot >= m)return true;
        }
        return false;
    }
    public int maxDistance(int[] position, int m) {
        Arrays.sort(position);
        int low = 1, high = (position[position.length - 1] - position[0]) / (m - 1);
        int ans = 1;
        while(low <= high){
            int mid = low + (high - low) / 2;
            if(check(position, mid, m)){
                ans = mid;
                low = mid + 1;
            }
            else high = mid - 1;
        }
        return ans;
    }
}