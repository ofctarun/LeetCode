class Solution {
    public int minOperations(int[][] grid, int x) {
        int m = grid.length,n = grid[0].length,ans = 0;
        int arr[] = new int[m*n];
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                arr[n*i + j] = grid[i][j];
            }
        }
        Arrays.sort(arr);
        int target = arr[arr.length/2];
        for(var el : arr){
            if((el % x) != (target % x))return -1;
            ans += Math.abs(target - el)/x;
        }
        return ans;
    }
}