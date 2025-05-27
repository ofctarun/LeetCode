class Solution {
    public int differenceOfSums(int n, int m) {
        int divisible = 0;
        for(int i=1;m*i<=n;i++){
            divisible += m*i;
        }
        System.out.println(divisible);
        return n*(n+1)/2 - 2*divisible;
    }
}