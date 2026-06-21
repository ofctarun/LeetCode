class Solution {
    public int maxIceCream(int[] costs, int coins) {
        Arrays.sort(costs);
        int sum = 0,n = costs.length;
        for(int i = 0; i < n; i++){
            sum += costs[i];
            if(sum > coins)return i;
        }
        return n;
    }
}