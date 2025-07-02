class Solution {
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        List<List<Integer>> graph = new ArrayList<>();
        for(int i=0;i<n;i++)graph.add(new ArrayList<>());
        for(int[] edge : edges){
            graph.get(edge[0]).add(edge[1]);
            graph.get(edge[1]).add(edge[0]);
        }
        Queue<Integer> q = new LinkedList<>();
        q.offer(source);
        boolean vis[] = new boolean[n];
        vis[source] = true;
        while(!q.isEmpty()){
            int val = q.poll();
            if(val == destination)return true;
            for(int nodes : graph.get(val)){
                if(!vis[nodes]){
                    vis[nodes] = true;
                    q.offer(nodes);
                }
            }
        }
        return false;
    }
}