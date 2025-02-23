class Solution {
    public long maxSum(int[][] grid, int[] limits, int k) {
        int m = grid.length;
        PriorityQueue<Integer> arr = new PriorityQueue<>((a,b)->b-a);
        long sum = 0;
        for(int i=0;i<m;i++){
            Arrays.sort(grid[i]);
            for(int j=0;j<limits[i];j++){
                if(j<grid[i].length)arr.offer(grid[i][grid[i].length-1-j]);
            }
        }
        for(int i=0;i<k && !arr.isEmpty();i++){
            sum+=arr.poll();
        }
        return sum;
    }
}