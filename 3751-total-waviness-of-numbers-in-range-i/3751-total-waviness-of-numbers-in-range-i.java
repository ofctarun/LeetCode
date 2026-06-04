class Solution {
    int waviness(int n){
        int c = 0;
        int next = n % 10;
        n /= 10;
        int curr = n % 10;
        n /= 10;
        while(n > 0){
            int prev = n % 10;
            if((curr > prev && curr > next) ||(curr < prev && curr < next))c++;
            next = curr;
            curr = prev;
            n /= 10;
        }
        return c;
    }
    public int totalWaviness(int num1, int num2) {
        int ans = 0;
        for(int i = Math.max(101,num1) ; i <= num2 ; i++)ans += waviness(i);
        return ans;
    }
}