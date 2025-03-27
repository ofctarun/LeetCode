class Solution {
    public int minOperations(int[][] grid, int x) {
        int m = grid.length,n = grid[0].length,ans = 0;
        int base = grid[0][0] % x;
        int arr[] = new int[m*n];
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j] % x != base)return -1;
                arr[n*i + j] = grid[i][j];
            }
        }
        Arrays.sort(arr);
        int target = arr[arr.length/2];
        for(var el : arr){
            ans += Math.abs(target - el)/x;
        }
        return ans;
    }
}