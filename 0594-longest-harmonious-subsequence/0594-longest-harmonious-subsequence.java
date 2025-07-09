class Solution {
    public int findLHS(int[] nums) {
        HashMap<Integer,Integer> hm = new HashMap<>();
        for(var val : nums) hm.put(val,hm.getOrDefault(val,0) + 1);
        int ans = 0;
        for(var key : hm.keySet()){
            if(hm.containsKey(key + 1)){
                int curr = hm.get(key) + hm.get(key + 1);
                ans = ans > curr ? ans : curr;
            }
        }
        return ans;
    }
}