class Solution {
    int waviness(int i){
        int num = i / 100;
        int next = i % 10 , c = 0;
        i /= 10;
        while(i > 0 && num > 0){
            int curr = i % 10;
            int prev = num % 10;
            if( curr > prev && curr > next)c++;
            if( curr < prev && curr < next)c++;
            next = curr;
            num /= 10; i /= 10;
        }
        return c;
    }
    public int totalWaviness(int num1, int num2) {
        int ans = 0;
        for(int i = num1 ; i <= num2 ; i++)if(i > 100)ans += waviness(i);
        return ans;
    }
}