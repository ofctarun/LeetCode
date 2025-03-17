class Solution {
    public boolean isHappy(int n) {
        HashSet<Integer> hs = new HashSet<>();
        while(!hs.contains(n)){
            hs.add(n);
            int next = 0;
            while(n>0){
                int num = n%10;
                next += num*num;
                n = n/10;
            }
            if(next==1)return true;
            n = next;
        }
        return false;
    }
}