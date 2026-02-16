// 424. Longest Repeating Character Replacement
class Solution {
    public int characterReplacement(String s, int k) {
        int[] charCounts = new int[26];

        int windowStart = 0;
        int maxLength = 0;
        int maxFreq = 0;

        for (int windowEnd = 0; windowEnd < s.length(); windowEnd++) {
            int currentCharIdx = s.charAt(windowEnd) - 'A';
            charCounts[currentCharIdx]++;

            maxFreq = Math.max(maxFreq, charCounts[currentCharIdx]);

            int windowLength = windowEnd - windowStart + 1;

            if (windowLength - maxFreq > k) {
                charCounts[s.charAt(windowStart) - 'A']--;
                windowStart++;
            }

            maxLength = Math.max(maxLength, windowEnd - windowStart + 1);
        }

        return maxLength;
    }
}