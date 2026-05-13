public class Solution {
    public bool hasDuplicate(int[] nums) {
        HashSet<int> count = new HashSet<int>();

        for(int i=0; i<nums.Length; i++){
            if(count.Contains(nums[i])){
                return true;
            }
            count.Add(nums[i]);
        }

        return false;
    }
}