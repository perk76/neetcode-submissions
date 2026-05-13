class Solution {
    public boolean isAnagram(String s, String t) {

        if(s.length() != t.length()){
            return false;
        }

        HashMap<Character,Integer> map = new HashMap<>();

        for(int i=0; i< s.length(); i++){
            int count = map.getOrDefault(s.charAt(i),0);
            map.put(s.charAt(i), ++count);
        }

        for(int i=0; i< t.length(); i++){
            int count = map.getOrDefault(t.charAt(i),0);
            if(count == 0){
                return false;
            }
            if(count == 1){
                map.remove(t.charAt(i));
            } else {
                map.put(t.charAt(i), --count);
            }

        }

        if(map.size() == 0){
            return true;
        }
        return false;
    }
}
