class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashMap<Integer,Integer> count = new HashMap<Integer,Integer>();
        for(int i = 0; i < nums.length; i++){
            count.put(nums[i],count.getOrDefault(nums[i],0)+1);
            if(count.get(nums[i])>1){
                return true;
            }
        }
        return false;
    }
}
