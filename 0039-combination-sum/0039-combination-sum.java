class Solution {
    List<List<Integer>> ans = new ArrayList<>();
    void findCombinations(int idx,int[] candidates,int target,ArrayList<Integer> curr){
        if(target==0){
            ans.add(new ArrayList(curr));
            return;
        }
        if(idx==candidates.length || target<0){
            return;
        }
        curr.add(candidates[idx]);
        findCombinations(idx,candidates,target-candidates[idx],curr);
        curr.remove(curr.size()-1);
        findCombinations(idx+1,candidates,target,curr);
    }
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        ArrayList<Integer> curr = new ArrayList<>();
        findCombinations(0,candidates,target,curr);
        return ans;
    }
}