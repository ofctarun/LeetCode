class Solution {
    public double maxAverageRatio(int[][] classes, int extraStudents){
        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b)->{
            double gainA = ((double)(a[0]+1)/(a[1]+1))-((double)a[0]/a[1]);
            double gainB = ((double)(b[0]+1)/(b[1]+1))-((double)b[0]/b[1]);
            return Double.compare(gainB, gainA);
        });
        for(int[] c : classes){
            pq.offer(c);
        }
        while(extraStudents-->0){
            int[] top = pq.poll();
            top[0]++;
            top[1]++;
            pq.offer(top);
        }
        double totalPassRatio=0;
        for(int[] c : classes){
            totalPassRatio += (double)c[0]/c[1];
        }
        return totalPassRatio/classes.length;
    }
}
