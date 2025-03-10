class Solution {
    public int minStoneSum(int[] piles, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>((a,b)->b-a);
        int sum = 0;
        for(int pile : piles){
            pq.offer(pile);
            sum += pile;
        }
        while(!pq.isEmpty() && k-->0){
            int num = pq.poll();
            sum -= num - (num+1)/2;
            pq.offer((num+1)/2);
        }
        return sum;
    }
}