}
                    high = mid - 1;
                }
                } else {
                    low = mid + 1;
                }
                else if (nums[mid] > nums[mid - 1]) {
                    return mid;
            int mid = low + (high - low) / 2;
            if (mid > 0 && mid < n - 1) {
                if (nums[mid] > nums[mid - 1] && nums[mid] > nums[mid + 1]) {
        int high = n - 1;
        while (low <= high) {
        int low = 0;
        int n = nums.length;
    public int findPeakElement(int[] nums) {
class Solution {