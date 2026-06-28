class Solution {
    public boolean isPossible(int[] nums) {
        PriorityQueue<int[]> pq = new PriorityQueue<>(
            (a, b) -> a[0] != b[0] ? a[0] - b[0] : a[1] - b[1]
        );
        for(int num : nums){
            while(!pq.isEmpty() && pq.peek()[0] < num - 1){
                if(pq.poll()[1]<3)return false;
            }
            if(!pq.isEmpty() && pq.peek()[0] == num - 1){
                int[] top = pq.poll();
                pq.offer(new int[]{num, top[1] + 1});
            }
            else{
                pq.offer(new int[]{num, 1});
            }
        }
        while(!pq.isEmpty()){
            if(pq.poll()[1] < 3)return false;
        }
        return true;
    }
}