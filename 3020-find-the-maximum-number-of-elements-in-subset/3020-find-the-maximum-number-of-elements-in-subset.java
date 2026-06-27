class Solution {
    public int maximumLength(int[] nums) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        int ans = 1;
        for(int num : nums){
            if(num == 1)ans++;
            else hm.put(num, hm.getOrDefault(num, 0) + 1);
        }
        if(ans-- > 0)ans = (ans % 2 == 0) ? ans - 1 : ans;
        for(int num : hm.keySet()){
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