//2357. Make Array Zero by Subtracting Equal Amounts
class Solution {
    public int minimumOperations(int[] nums) {
        int count = 0;

        while (true) {
            int min = Integer.MAX_VALUE;

            for (int num : nums) {
                if (num > 0 && num < min) {
                    min = num;
                }
            }

            if (min == Integer.MAX_VALUE) {
                break;
            }

            for (int i = 0; i < nums.length; i++) {
                if (nums[i] > 0) {
                    nums[i] -= min;
                }
            }

            count++;
        }

        return count;
    }
}
