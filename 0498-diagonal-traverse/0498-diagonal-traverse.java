class Solution {
    public int[] findDiagonalOrder(int[][] mat) {
        int m = mat.length;
        int n = mat[0].length;
        int[] ans = new int[m * n];
        int i = 0, j = 0;
        boolean up = true;        
        for (int idx = 0; idx < m * n; idx++) {
            ans[idx] = mat[i][j];            
            if (up) {
                if (j + 1 < n && i - 1 >= 0) {
                    i--;
                    j++;
                } else {
                    up = false;
                    if (j + 1 < n) {
                        j++;
                    } else {
                        i++;
                    }
                }
            } else {
                if (i + 1 < m && j - 1 >= 0) {
                    i++;
                    j--;
                } else {
                    up = true;
                    if (i + 1 < m) {
                        i++;
                    } else {
                        j++;
                    }
                }
            }
        }
        return ans;
    }
}