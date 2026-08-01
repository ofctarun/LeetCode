class Solution {
    private List<List<Integer>> res = new ArrayList<>();
    private List<Integer> lst = new ArrayList<>();
    void backtrack(int idx, int[] nums, boolean[] vis){
        if(idx == nums.length){
            res.add(new ArrayList<>(lst));
            return;
        }
        for(int i=0;i<vis.length;i++){
            if(!vis[i]){
                lst.add(nums[i]);
                vis[i] = true;
                backtrack(idx + 1, nums, vis);
                lst.remove(lst.size() - 1);
                vis[i] = false;
            }
        }
    }
    public List<List<Integer>> permute(int[] nums) {
        boolean[] vis = new boolean[nums.length];
        backtrack(0,nums, vis);
        return res;
    }
}