// 8. String to Integer (atoi)
class Solution {
    public int myAtoi(String s) {
        if (s == null || s.length() == 0)
            return 0;

        int n = s.length();
        int i = 0;

        while (i < n && s.charAt(i) == ' ') {
            i++;
        }
        if (i == n)
            return 0;

        int sign = 1;
        if (s.charAt(i) == '+' || s.charAt(i) == '-') {
            sign = (s.charAt(i) == '-') ? -1 : 1;
            i++;
        }

        // 3. Convert characters to integer and handle overflow
        int result = 0;
        while (i < n) {
            char curr = s.charAt(i);

            // Stop if non-digit character is encountered
            if (curr < '0' || curr > '9')
                break;

            int digit = curr - '0';

            // 4. Overflow Check
            // Integer.MAX_VALUE is 2147483647
            // If result > 214748364, adding any digit will overflow.
            // If result == 214748364, we can only add digits up to 7.
            if (result > Integer.MAX_VALUE / 10 ||
                    (result == Integer.MAX_VALUE / 10 && digit > Integer.MAX_VALUE % 10)) {
                return (sign == 1) ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }

            result = result * 10 + digit;
            i++;
        }

        return result * sign;
    }
}