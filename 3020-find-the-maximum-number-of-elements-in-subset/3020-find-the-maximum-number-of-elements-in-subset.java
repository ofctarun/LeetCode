class Solution {
    public int maximumLength(int[] nums) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        for(int num : nums)hm.put(num, hm.getOrDefault(num, 0) + 1);
        int ans = hm.getOrDefault(1, 1);
        ans = (ans & 1) == 0 ? ans - 1 : ans;
        for(int num : hm.keySet()){
            if(num == 1)continue;
            int len = 0;
            while(hm.containsKey(num)){
                if(hm.get(num) == 1 || !hm.containsKey(num * num)){
                    len = 1 + (len) * 2;
                    break;
                }
                len++;
                num *= num;
            }
            ans = Math.max(ans, len);
        }
        return ans;
    }
}