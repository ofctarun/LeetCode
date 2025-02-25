class Solution {
    public int[] findingUsersActiveMinutes(int[][] logs, int k) {
        HashMap<Integer,Set<Integer>> hm = new HashMap<>();
        for(int i=0;i<logs.length;i++) {
            var cur = hm.get(logs[i][0]);
            if (cur!=null) {
                cur.add(logs[i][1]);
            }
            else{
                var newH = new HashSet();
                newH.add(logs[i][1]);
                hm.put(logs[i][0],newH);
            }
        }
        int[] res = new int[k];
        int ans[] = new int[k];
        for(Set<Integer> min : hm.values()){
            ans[min.size()-1]++;
        }
        return ans;
    }
}