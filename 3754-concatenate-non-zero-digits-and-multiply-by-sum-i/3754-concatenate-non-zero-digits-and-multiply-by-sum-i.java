class Solution {
    public long sumAndMultiply(int n) {
        long x = 0, sum = 0, ans = 0;
        while(n > 0){
            long curr = n % 10;
            sum += curr;
            if(curr != 0)x = x * 10 + curr;
            n /= 10;
        }
        while(x > 0){
            ans = (ans * 10) + (x % 10);
            x /= 10;
        }
        return ans * sum;
    }
}