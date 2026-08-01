class Solution {
    private List<List<Integer>> result = new ArrayList<>();
    void backtrack(int n, int k, int st, List<Integer> lst, List<List<Integer>> res){
        if(k == 0){
            res.add(new ArrayList<>(lst));
            return;
        }
        for(int i = st; i <= n; i++){
            lst.add(i);
            backtrack(n, k-1, i+1, lst, res);
            lst.remove(lst.size() - 1);
        }
    }
    public List<List<Integer>> combine(int n, int k) {
        backtrack(n, k, 1, new ArrayList<>(), result);
        return result;
    }
}