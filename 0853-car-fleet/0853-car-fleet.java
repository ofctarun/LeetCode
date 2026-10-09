class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        int n = position.length;
        Integer[] sorted = new Integer[n];
        for(int i = 0; i < n; i++)sorted[i] = i;
        Arrays.sort(sorted, (a, b) -> Integer.compare(position[b], position[a]));
        Stack<Double> st = new Stack<>();
        for(int i : sorted){
            double time = (double)(target - position[i]) / speed[i];
            if(st.isEmpty() || st.peek() < time)st.push(time);
        }
        return st.size();
    }
}