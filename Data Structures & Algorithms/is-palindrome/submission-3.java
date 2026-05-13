class Solution {
    public boolean isPalindrome(String s) {
        int front = 0;
        char frontChar, rearChar;
        int rear = s.length() - 1;
        while(front < rear){
            frontChar = s.charAt(front);
            rearChar = s.charAt(rear);
            while(!alphanum(frontChar) && front < rear){
                front++;
                frontChar = s.charAt(front);
            }
            while(!alphanum(rearChar) && front < rear){
                rear--;
                rearChar = s.charAt(rear);
            }
            System.out.println(frontChar+ "" +rearChar);
            if(Character.toLowerCase(frontChar) != Character.toLowerCase(rearChar)){
                return false;
            }
            front++;
            rear--;
        }
        return true;
    }

     public boolean alphanum(char c) {
        return (c >= 'A' && c <= 'Z' || 
                c >= 'a' && c <= 'z' || 
                c >= '0' && c <= '9');
    }
}
