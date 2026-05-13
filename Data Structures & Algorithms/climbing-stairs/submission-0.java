class Solution {
    public int climbStairs(int n) {
        int ways = 0;
        int prev = 1;
        for(int i=0; i<=n; i++){
            int temp = ways+prev;
            prev = ways;
            ways = temp;
        }
        return ways;
    }
}
