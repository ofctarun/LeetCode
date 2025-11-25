class Solution {
    public int smallestRepunitDivByK(int k) {
        int rem = k % 10;
        if(rem != 1 && rem !=3 && rem != 7 && rem != 9)return -1;
        int num = 0;
        for(int i = 1; i <= k; i++){
            num = (num * 10 + 1) % k;
            if(num == 0)return i;
        }
        return -1;
    }
}