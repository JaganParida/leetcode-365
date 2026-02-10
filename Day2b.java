//2341. Maximum Number of Pairs in Array
class Solution {
    public int[] numberOfPairs(int[] nums) {
        boolean seen[] = new boolean[101];
        int pair = 0;
        for (int num : nums) {
            if (seen[num]) {
                pair++;
                seen[num] = false;
            } else {
                seen[num] = true;
            }
        }
        int remain = nums.length - pair * 2;
        return new int[] { pair, remain };
    }
}
