class Solution {
    public int minSetSize(int[] arr) {
        PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> b - a);
        HashMap<Integer,Integer> hm = new HashMap<>();
        for(var el : arr) hm.put(el, hm.getOrDefault(el, 0) + 1);
        List<Integer> freq = new ArrayList<>(hm.values());
        Collections.sort(freq); 
        int c = 0, ans = 0;
        for (int i=freq.size()-1;i>=0;i--) {
            c += freq.get(i);
            ans++;
            if (c >= arr.length / 2) break;
        }
        return ans;
    }
}