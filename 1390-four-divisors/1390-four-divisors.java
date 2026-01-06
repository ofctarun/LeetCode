class Solution {
    public int sumFourDivisors(int[] nums) {
        int ans = 0;
        for(int num : nums){
            int c = 0, sum = 0;
            for(int i = 1; i*i <= num; i++){
                if(num % i == 0){
                    int other = num / i;
                    if(i == other){
                        c++;
                        sum += i;
                    }
                    else{
                        c += 2;
                        sum += i + other;
                    }
                    if(c > 4)break;
                }
            }
            if(c == 4)ans += sum;
        }
        return ans;
    }
}