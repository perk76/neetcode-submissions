class Solution {
    public boolean hasDuplicate(int[] nums) {
        
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            if (map.containsKey(num)) {
                map.put(num, map.get(num) + 1);
            } else {
                map.put(num, 1);
            }
        }
        Integer one = new Integer(1);
        for (Integer i : map.values()) {
            if (!one.equals(i)) {
                return true;
            }
        }
        return false;
    }

}
