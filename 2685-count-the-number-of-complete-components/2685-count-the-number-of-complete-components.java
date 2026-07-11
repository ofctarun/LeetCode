class Solution {
    private int edgesCnt;
    private int verticesCnt;
    void dfs(int idx,ArrayList<ArrayList<Integer>> adj,boolean[] vis){
        vis[idx] = true;
        verticesCnt++;
        edgesCnt += adj.get(idx).size();
        for(int adjVal : adj.get(idx)){
            if(!vis[adjVal])
            dfs(adjVal,adj,vis);
        }
    }
    public int countCompleteComponents(int n, int[][] edges) {
        boolean vis[] = new boolean[n+1];
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>(n);
        for(int i=0;i<n;i++){
            adj.add(new ArrayList<Integer>());
        }
        for(int[] edge : edges){  
            adj.get(edge[0]).add(edge[1]);  
            adj.get(edge[1]).add(edge[0]);  
        }  
        int ans = 0;
        for(int i=0;i<n;i++){
            if(!vis[i]){
                verticesCnt = edgesCnt = 0;
                dfs(i,adj,vis);
                if(edgesCnt >= verticesCnt*(verticesCnt-1)) ans++;
            }    
        }
        return ans;
    }
}