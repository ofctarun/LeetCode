class Solution {
    public int minSetSize(int[] arr) {
        PriorityQueue<Integer> pq = new PriorityQueue<>((a,b)->b-a);
        HashMap<Integer,Integer> hm = new HashMap<>();
        for(var el : arr)hm.put(el,hm.getOrDefault(el,0)+1);
        for(var el : hm.values())pq.offer(el);
        int c=0,ans=0;
        while(c<arr.length/2){
            c+=pq.poll();
            ans++;
        }
        return ans;
    }
}