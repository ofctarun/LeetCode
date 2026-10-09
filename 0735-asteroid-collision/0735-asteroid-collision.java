class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        int i = -1;
        for(int x : asteroids){
            if(x > 0)asteroids[++i] = x;
            else{
                while(i >= 0 && asteroids[i] > 0 && asteroids[i] < -x){
                    i--;
                }
                if(i < 0 || asteroids[i] < 0){
                    asteroids[++i] = x;
                }
                else if(asteroids[i] == -x){
                    i--;
                }
            }
        }
        return Arrays.copyOfRange(asteroids,0,i+1);
    }
}