// 349. Intersection of Two Arrays
import java.util.*;
class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {

        boolean[] temp = new boolean[1001];
        ArrayList<Integer> arrlist = new ArrayList<>();

        for (int n : nums1) {
            temp[n] = true;
        }

        for (int n : nums2) {
            if (temp[n]) {
                arrlist.add(n);
                temp[n] = false;
            }
        }

        int[] res = new int[arrlist.size()];
        for (int i = 0; i < res.length; i++) {
            res[i] = arrlist.get(i);
        }
        return res;

    }
}