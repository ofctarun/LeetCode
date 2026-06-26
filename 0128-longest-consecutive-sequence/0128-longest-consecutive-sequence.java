class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> hs = new HashSet<>();
        for(int num : nums)hs.add(num);
        int ans = 0;
        for(int num : hs){
            if(!hs.contains(num - 1)){
                int i = 1;
                while(hs.contains(num + i))i++;
                ans = ans > i ? ans : i;
            }
        }
        return ans;
    }
}