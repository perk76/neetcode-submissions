class Solution {
    public boolean isPalindrome(String s) {
        int l = 0;
        int r = s.length()-1;
        s = s.toLowerCase();
        while(l < r){
            while(!isAlphaNum(s.charAt(l)) && l < r){
                l++;
            } 
            while(!isAlphaNum(s.charAt(r)) && l < r){
                r--;
            }
            if(s.charAt(l) != s.charAt(r)){
                return false;
            }
            l++;r--;
        }
        return true;
    }

    public static boolean isAlphaNum(char c){
        return (c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z') || (c >= '0' && c <= '9');
    }
}
