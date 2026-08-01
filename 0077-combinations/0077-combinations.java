class Solution {
    void backtrack(int n, int k, int st, List<Integer> lst, List<List<Integer>> res){
        if(lst.size() == k)res.add(new ArrayList<>(lst));
        for(int i = st; i <= n; i++){
            lst.add(i);
            backtrack(n, k, i+1, lst, res);
            lst.remove(lst.size() - 1);
        }
    }
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> result = new ArrayList<>();
        backtrack(n, k, 1, new ArrayList<>(), result);
        return result;
    }
}