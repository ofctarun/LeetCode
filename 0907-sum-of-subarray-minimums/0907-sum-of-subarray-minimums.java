class Solution {
    public int sumSubarrayMins(int[] arr) {
        int n = arr.length,mod = 1000000007;
        int[] l = new int[n];
        int[] r = new int[n];
        Stack<Integer> st = new Stack<>();
        for(int i=0;i<n;i++){
            while(!st.isEmpty() && arr[st.peek()] > arr[i])st.pop();
            l[i] = st.isEmpty() ? -1 : st.peek();
            st.push(i);
        }
        st.clear();
        long ans = 0;
        for(int i=n-1;i>=0;i--){
            while(!st.isEmpty() && arr[st.peek()] >= arr[i])st.pop();
            r[i] = st.isEmpty() ? n : st.peek();
            ans += (long)(i - l[i]) * (r[i] - i) * arr[i];
            ans %= mod;
            st.push(i);
        }
        return (int)ans;
    }
}