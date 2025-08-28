class Solution {
    public int[][] sortMatrix(int[][] grid) {
        int n = grid.length;
        
        // Sort the diagonals in the bottom-left triangle (including the middle diagonal) in non-increasing order
        for (int i = 0; i < n; i++) {
            int[] diagonal = collectDiagonal(i, 0, grid, n, n);
            Arrays.sort(diagonal);
            reverseArray(diagonal); // Sort in non-increasing order
            insertDiagonal(i, 0, diagonal, grid, n, n);
        }
        
        // Sort the diagonals in the top-right triangle in non-decreasing order
        for (int j = 1; j < n; j++) {
            int[] diagonal = collectDiagonal(0, j, grid, n, n);
            Arrays.sort(diagonal); // Sort in non-decreasing order
            insertDiagonal(0, j, diagonal, grid, n, n);
        }
        
        return grid;
    }
    
    int[] collectDiagonal(int i, int j, int[][] grid, int m, int n) {
        int[] diagonal = new int[Math.min(m - i, n - j)];
        int idx = 0;
        while (i < m && j < n) {
            diagonal[idx++] = grid[i][j];
            i++;
            j++;
        }
        return diagonal;
    }
    
    void insertDiagonal(int i, int j, int[] diagonal, int[][] grid, int m, int n) {
        int idx = 0;
        while (i < m && j < n) {
            grid[i][j] = diagonal[idx++];
            i++;
            j++;
        }
    }
    
    void reverseArray(int[] arr) {
        int left = 0, right = arr.length - 1;
        while (left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
    }
}