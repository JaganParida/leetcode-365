//2210. Count Hills and Valleys in an Array
class Solution {
    public int countHillValley(int[] nums) {
        int n = nums.length;
        int i = 0;
        int j = 1;
        int count = 0;
        while (j + 1 < n) {
            if ((nums[j] > nums[i] && nums[j] > nums[j + 1]) || (nums[j] < nums[i] && nums[j] < nums[j + 1])) {
                count++;
                i = j;
            }
            j++;
        }
        return count;
    }
}