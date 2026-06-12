class Solution {
    public int sumSubarrayMins(int[] arr) {
        int n = arr.length,mod = 1000000007,top=-1;
        int[] stack = new int[n + 1];
        int[] l = new int[n];
        int[] r = new int[n];
        for(int i = 0; i < n; i++){
            while(top >= 0 && arr[stack[top]] > arr[i])top--;
            l[i] = (top == -1) ? -1 : stack[top];
            stack[++top] = i;
        }
        top = -1;
        for(int i = n - 1; i >= 0; i--){
            while(top >= 0 && arr[stack[top]] >= arr[i])top--;
            r[i] = (top == -1) ? n : stack[top];
            stack[++top] = i;
        }
        long ans = 0;
        for(int i = 0; i < n; i++){
            long count = (long)(i - l[i]) * (r[i] - i);
            ans = (ans + (count % mod) * arr[i]) % mod;
        }
        return (int)ans;
    }
}