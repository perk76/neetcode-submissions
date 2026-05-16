class Solution {
    public String longestCommonPrefix(String[] strs) {
        String prefix = "";
        for(int i=0; i<strs[0].length(); i++){
            char letter = strs[0].charAt(i);
            System.out.println("Letter: " + letter);
            for(int j=1; j<strs.length; j++){
                if(strs[j].length() <= i || letter != strs[j].charAt(i)){
                    return prefix;
                }
            }
            prefix = prefix + letter;
        }
        return prefix;
    }
}