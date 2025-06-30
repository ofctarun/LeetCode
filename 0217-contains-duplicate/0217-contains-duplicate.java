class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> hs = new HashSet<>();
        for(var num : nums){
            hs.add(num);
        }
        return nums.length != hs.size();
    }
}