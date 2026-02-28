class Solution {
    public int concatenatedBinary(int n) {
        long decimal=0;
        int mod = 1_000_000_007;
        for (int i = 1; i <= n; i++) {
           String bin = Integer.toBinaryString(i);  // extract bits

          for (int j = 0; j < bin.length(); j++) {
           decimal =(decimal * 2 + (bin.charAt(j) - '0'))%mod; // calculate
         }
        }
        return (int)decimal;
    }
}