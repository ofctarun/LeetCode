class Solution {
    public long maxPoints(int[] technique1, int[] technique2, int k) {
        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> a[0] - b[0]);
        boolean[] vis = new boolean[technique1.length];
        long ans = 0;
        for(int i = 0; i < technique1.length; i++){
            if(technique1[i] > technique2[i]){
                k--;
                ans += technique1[i];
                vis[i] = true;
            }
            else{
                pq.offer(new int[]{technique2[i] - technique1[i], i});
            }
        }
        while(k-- > 0){
            ans += technique1[pq.peek()[1]];
            vis[pq.poll()[1]] = true;
        }
        for(int i = 0; i < technique1.length; i++){
            if(!vis[i])ans += Math.max(technique1[i] ,technique2[i]);
        }
        return ans;
    }
}