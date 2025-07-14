class Solution {
    public long maximumImportance(int n, int[][] roads) {
        int deg[] = new int[n];
        for(int[] road : roads){
            deg[road[0]]++;
            deg[road[1]]++;
        }
        Integer nodes[] = new Integer[n];
        for(int i=0;i<n;i++)nodes[i] = i;
        Arrays.sort(nodes,(a,b) -> deg[b] - deg[a]);
        int val[] = new int[n];
        int imp = n;
        for(int node : nodes)val[node] = imp--;
        long ans = 0;
        for(int[] road : roads)ans += val[road[0]] + val[road[1]];
        return ans;
    }
}