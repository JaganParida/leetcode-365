//2164. Sort Even and Odd Indices Independently
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Solution {
    public int[] sortEvenOdd(int[] nums) {
        List<Integer> evenIndices = new ArrayList<>();
        List<Integer> oddIndices = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            if (i % 2 == 0) {
                evenIndices.add(nums[i]);
            } else {
                oddIndices.add(nums[i]);
            }
        }

        Collections.sort(evenIndices);
        Collections.sort(oddIndices, Collections.reverseOrder());

        int evenPtr = 0;
        int oddPtr = 0;

        for (int i = 0; i < nums.length; i++) {
            if (i % 2 == 0) {
                nums[i] = evenIndices.get(evenPtr++);
            } else {
                nums[i] = oddIndices.get(oddPtr++);
            }
        }

        return nums;
    }
}