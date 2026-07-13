class Solution {
    public List<Integer> sequentialDigits(int low, int high) {
        List<Integer> ans = new ArrayList<>();
        String num = "0123456789";
        int size = String.valueOf(low).length();
        int st = 1; 
        int end = st + size;
        int curr = Integer.valueOf(num.substring(st, end));
        while(curr <= high){
            if(curr >= low)ans.add(curr);
            st++;
            end++;
            if(end > 10){
                size++;
                if(size > 9)break;
                st = 1;
                end = size + st;
            }
            curr = Integer.valueOf(num.substring(st, end));
        }
        return ans;
    }
}