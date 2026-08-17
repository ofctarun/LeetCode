class Solution {
    public int nearestDrone(int[][] drones, int[] target) {
        int d = Integer.MAX_VALUE, ans = 0;
        for(int i = 0; i < drones.length; i++){
            int arr[] = drones[i];
            int curr = Math.abs(arr[0] - target[0]) + Math.abs(arr[1] - target[1]);
            if(curr <= arr[2] && curr < d){
                d = curr;
                ans = i;
            }
        }
        return (d == Integer.MAX_VALUE) ? -1 : ans;
    }
}