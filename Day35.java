// 647. Palindromic Substrings
class Solution {
    public int countSubstrings(String s) {
        int count = 0;

        for (int i = 0; i < s.length(); i++) {
            count += expandFromCenter(s, i, i);
            count += expandFromCenter(s, i, i + 1);
        }

        return count;
    }

    private int expandFromCenter(String s, int left, int right) {
        int localCount = 0;
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            localCount++;
            left--;
            right++;
        }

        return localCount;
    }
}