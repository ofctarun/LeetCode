class Solution {
    public double angleClock(int hour, int minutes) {
        double ans = Math.abs(30*hour - (11.0 * minutes/2.0));
        return Math.min(ans, 360 - ans);
    }
}