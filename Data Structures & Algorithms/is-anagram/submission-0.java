class Solution {
    public boolean isAnagram(String s, String t) {
        s = s.toLowerCase();
        t = t.toLowerCase();
        
        if(s.length() != t.length()){
            return false;
        }
        HashMap<Character,Integer> count = new HashMap<Character,Integer>();
        char a,b = ' ';
        for(int i=0; i<s.length(); i++){
            a = s.charAt(i);
            b = t.charAt(i);
            count.put(a,count.getOrDefault(a,0)+1);
            count.put(b,count.getOrDefault(b,0)-1); 
        }
        for(Character j : count.keySet()){
            if(count.getOrDefault(j,0) != 0){
                return false;
            }
        }
        return true;
    }
}
