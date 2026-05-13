class Solution {
    public boolean isHappy(int n) {
        int slow = n;
        int fast = sum(n);
        while(slow != fast){
            slow = sum(slow);
            if(slow == 1){
                return true;
            }
            fast = sum(fast);
            fast = sum(fast);
            if(fast == 1){
                return true;
            }
        }
        if(slow == 1){
            return true;
        }
        return false;
    }

    public static int sum(int n){
        int output = 0;
        while (n != 0) {
            output += (n % 10) * (n % 10);
            n /= 10;
        }
        return output;
    }
}
