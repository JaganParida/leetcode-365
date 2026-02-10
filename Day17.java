//33. Search in Rotated Sorted Array
class Solution {
    public int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (nums[mid] == target) {
                return mid;
            }

            // Check if the left half is sorted
            if (nums[left] <= nums[mid]) {
                // If target is within the sorted left half range
                if (nums[left] <= target && target < nums[mid]) {
                    right = mid - 1;
                } else {
                    // Target is in the right half
                    left = mid + 1;
                }
            } 
            // Otherwise, the right half must be sorted
            else {
                // If target is within the sorted right half range
                if (nums[mid] < target && target <= nums[right]) {
                    left = mid + 1;
                } else {
                    // Target is in the left half
                    right = mid - 1;
                }
            }
        }

        return -1;
    }
}