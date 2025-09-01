class Solution {
    public double maxAverageRatio(int[][] classes, int extraStudents) {
         PriorityQueue<double[]> pq = new PriorityQueue<>((a, b) -> Double.compare(b[2], a[2]));
        for(int[] c : classes){
            double passRatio = (double)c[0]/c[1];
            double gain = ((double)(c[0]+1)/(c[1]+1))-passRatio;
            pq.offer(new double[]{c[0],c[1],gain});
        }
        while(extraStudents-->0){
            double[] top = pq.poll();
            double pass = top[0] + 1;
            double total = top[1] + 1;
            double newGain = ((pass+1)/(total+1))-(pass/total);
            pq.offer(new double[]{pass,total,newGain});
        }
        double ans = 0;
        while (!pq.isEmpty()) {
            double[] top = pq.poll();
            ans += top[0]/top[1];
        }
        return ans/classes.length;
    }
}