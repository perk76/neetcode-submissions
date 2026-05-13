class Solution {
    public int search(int[] nums, int target) {
        return bSearch(nums, 0, nums.length - 1, target);
    }

    public int bSearch(int[] nums, int start, int end, int target){
        int mid = (start+end)/2;
        if(target == nums[mid]){
            return mid;
        }else {
            if(start == end){
                return -1;
            }
            if(target < nums[mid]){
                return bSearch(nums, start, mid, target);
            }else if(target > nums[mid]){
                return bSearch(nums, mid + 1, end, target);
            }
        }
        return -1;
    }
}
