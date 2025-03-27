import java.util.Arrays;  

class Solution {  
    public int minOperations(int[][] grid, int x) {  
        int[] v = new int[10001]; // Array to count occurrences of each value  
        int l = Integer.MAX_VALUE; // Initialize min value  
        int n = 0; // Count of total elements  
        
        // Traverse the grid to populate the count array and find the minimum value  
        for (int[] a : grid) {  
            for (int b : a) {  
                l = Math.min(l, b);  
                v[b]++;  
                n++;  
            }  
        }  

        long c = 0; // Initial cost  
        for (int i = 0; i <= 10000; i++) {  
            if (v[i] > 0) {  
                if ((i - l) % x != 0) return -1; // Return -1 if the condition is not met  
                c += (i - l) * v[i] / x; // Calculate cost  
            }  
        }  

        long m = c; // Current cost  
        long ans = c; // Minimum operations  
        long k = 0; // Count of elements processed  
        
        // Adjusting cost based on available values  
        for (int i = 1; i <= 10000; i++) {  
            k += v[l + (i - 1) * x]; // Number of elements equal to l + (i - 1) * x  
            m += (2 * k - n); // Modify the current cost  
            ans = Math.min(ans, m); // Update minimum operations  
            
            if (2 * k - n > 0) return (int) ans; // If current count exceeds, return the answer  
        }  

        return (int) ans; // Return the final result  
    }  
}  