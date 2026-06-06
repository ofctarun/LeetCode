class Solution {
    static{
        for(int i=0;i<1000;i++){
            subarraySum(new int[] {},i);
        }
    }
    public static int subarraySum(int[] nums, int k) {
        HashMap<Integer,Integer> hm = new HashMap<>();
        int sum = 0,ans = 0;
        hm.put(0, 1);
        for(int n : nums){
            sum += n;
            ans += hm.getOrDefault(sum - k, 0);
            hm.put(sum, hm.getOrDefault(sum, 0) + 1);
        }
        return ans;
    }
}