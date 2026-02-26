import java.math.BigInteger;

class Solution {
    public int numSteps(String s) {

        int n = s.length();
        int c = 0;

        // FIX 1: use BigInteger instead of int
        BigInteger v = BigInteger.ZERO;

        // FIX 2: correct binary → decimal conversion (left to right)
        for (int i = 0; i < n; i++) {
            v = v.multiply(BigInteger.valueOf(2))
                 .add(BigInteger.valueOf(s.charAt(i) - '0'));
        }

        // SAME LOGIC as yours
        while (!v.equals(BigInteger.ONE)) {
            if (v.mod(BigInteger.valueOf(2)).equals(BigInteger.ZERO)) {
                v = v.divide(BigInteger.valueOf(2));
                c++;
            } else {
                v = v.add(BigInteger.ONE);
                c++;
            }
        }

        return c;
    }
}