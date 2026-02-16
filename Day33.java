// 76. Minimum Window Substring
class Solution {
    public String minWindow(String s, String t) {

        if (s.length() < t.length())
            return "";

        int[] freq = new int[128];

        for (char c : t.toCharArray()) {
            freq[c]++;
        }

        int left = 0;
        int right = 0;
        int count = t.length();

        int minLength = Integer.MAX_VALUE;
        int start = 0;

        while (right < s.length()) {

            // include right character
            if (freq[s.charAt(right)] > 0) {
                count--;
            }

            freq[s.charAt(right)]--;
            right++;

            // valid window found
            while (count == 0) {

                // update minimum window
                if (right - left < minLength) {
                    minLength = right - left;
                    start = left;
                }

                // remove left character
                freq[s.charAt(left)]++;

                if (freq[s.charAt(left)] > 0) {
                    count++;
                }

                left++;
            }
        }

        if (minLength == Integer.MAX_VALUE) {
            return "";
        }

        return s.substring(start, start + minLength);
    }
}
