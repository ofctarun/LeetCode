class Solution {
public:
    int minOperations(vector<vector<int>>& grid, int x) {
        int m = grid.size(),n = grid[0].size(),ans = 0;
        int base = grid[0][0] % x;
        vector<int> arr(m * n);
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j] % x != base)return -1;
                arr[n*i + j] = grid[i][j];
            }
        }
        int L = arr.size();
        nth_element(begin(arr),begin(arr) + L/2,end(arr)); //O(L)
        int target = arr[L/2];
        for(auto el : arr){
            ans += abs(target - el)/x;
        }
        return ans;
    }
};