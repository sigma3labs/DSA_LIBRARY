//Question Link: https://leetcode.com/problems/divide-two-integers/

class Solution {
    public int divide(int dividend, int divisor) {
        if (divisor == 0) {
            return 0;
        }
        if (dividend == Integer.MIN_VALUE && divisor == -1) {
            return Integer.MAX_VALUE;
        }
        int quotient = 0;
        boolean negative = (dividend < 0) != (divisor < 0);
        long longDividend = Math.abs((long) dividend);
        long longDivisor = Math.abs((long) divisor);
        while (longDividend >= longDivisor) {
            int shift = 0;
            while (longDividend >= (longDivisor << shift)) {
                shift++;
            }
            shift--;
            longDividend -= longDivisor << shift;
            quotient += 1 << shift;
        }
        return negative ? -quotient : quotient;
    }
}
