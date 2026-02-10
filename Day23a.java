
//128. Longest Consecutive Sequence
import java.util.*;

class Solution {
    public int longestConsecutive(int[] nums) {
        int n = nums.length;
        if (n == 0)
            return 0;

        Arrays.sort(nums);

        int maxLen = 1;
        int count = 1;

        for (int i = 1; i < n; i++) {

            // skip duplicates
            if (nums[i] == nums[i - 1]) {
                continue;
            }

            // check consequtive
            if (nums[i] == nums[i - 1] + 1) {
                count++;
            } else {
                count = 1; // reset the previous value
            }

            maxLen = Math.max(maxLen, count);
        }
        return maxLen;
    }
}