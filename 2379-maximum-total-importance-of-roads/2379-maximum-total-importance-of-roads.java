class Solution {
    public long maximumImportance(int n, int[][] roads) {
        int deg[] = new int[n];
        for(int[] road : roads){
            deg[road[0]]++;
            deg[road[1]]++;
        }
        Arrays.sort(deg);
        long ans = 0;
        for(int i=0;i<n;i++){
            ans += (long)deg[i] * (i+1);
        }
        return ans;
    }
}