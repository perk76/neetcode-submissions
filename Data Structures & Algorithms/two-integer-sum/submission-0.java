class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> addee = new HashMap<Integer,Integer>();
        for(int i = 0; i < nums.length; i++){
            if(addee.containsKey(target - nums[i])){
                return new int [] {addee.get(target - nums[i]), i};
            }
            addee.put(nums[i],i);
        }
        return new int[] {};
    }
}
