class Solution {
    public int[] kWeakestRows(int[][] mat, int k) {
        PriorityQueue<int[]> pq = new PriorityQueue<>(
            (a,b) -> a[0] == b[0] ? a[1] - b[1] : a[0] - b[0]
        );
        for(int i=0;i<mat.length;i++){
            int c = 0;
            for(int j=0;j<mat[0].length;j++){
                if(mat[i][j] == 1)c++;
            }
            pq.add(new int[]{c,i});
        }
        int ans[] = new int[k];
        for(int i=0;i<k;i++){
            ans[i] = pq.poll()[1];
        }
        return ans;
    }
}