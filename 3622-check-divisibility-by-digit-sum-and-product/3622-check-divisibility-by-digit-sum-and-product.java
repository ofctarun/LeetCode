class Solution {
    public boolean checkDivisibility(int n) {
        int ds = 0, dp = 1,n2 = n;
        while(n > 0){
            int rem = n%10;
            ds += rem;
            dp *= rem;
            n/=10;
        }
        return (n2%(ds+dp)) == 0;
    }
}