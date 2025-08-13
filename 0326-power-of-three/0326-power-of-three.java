class Solution {
    public boolean isPowerOfThree(int n) {
        if(n==1)return true;
        if(n <= 2)return false;
        while(n > 3){
            if(n % 3 != 0)return false;
            n = n / 3;
            System.out.println(n);
        }
        return n == 3 ? true : false;
    }
}