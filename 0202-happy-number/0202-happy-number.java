class Solution {
    int getNext(int n){
        int ans = 0;
        while(n > 0){
            int c = n % 10;
            ans += c*c;
            n /= 10;
        }
        return ans;
    }
    public boolean isHappy(int n) {
        int slow = n,fast = n;
        do{
            slow = getNext(slow);
            fast = getNext(getNext(fast));
        }while(slow != fast);
        return slow == 1;
    }
}