class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> set = new HashSet<Character>();

        int f = 0;
        int max = 0;

        for(int r = 0; r< s.length(); r++){
            while(set.contains(s.charAt(r))){
                set.remove(s.charAt(f));
                f++;
            }
            set.add(s.charAt(r));
            max = Math.max(max, r - f + 1);
        }
            return max;
    }
}
