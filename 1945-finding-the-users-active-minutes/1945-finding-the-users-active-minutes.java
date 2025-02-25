class Solution {
    public int[] findingUsersActiveMinutes(int[][] logs, int k) {
        HashMap<Integer,Set<Integer>> hm = new HashMap<>();
        for(int[] log : logs){
            int user = log[0];
            int min = log[1];
            hm.putIfAbsent(user,new HashSet<>());
            hm.get(user).add(min);
        }
        int ans[] = new int[k];
        for(Set<Integer> min : hm.values()){
            ans[min.size()-1]++;
        }
        return ans;
    }
}