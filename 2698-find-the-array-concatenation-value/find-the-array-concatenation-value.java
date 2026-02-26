class Solution {

    // counts number of digits
    private int multi(int n) {
        if (n == 0) return 1;   // FIX 1: handle 0
        int c = 0;
        while (n > 0) {
            c++;
            n /= 10;
        }
        return c;
    }

    public long findTheArrayConcVal(int[] nums) {
        int n = nums.length;
        long sum = 0;
        int i = 0;
        int j = n - 1;

        while (i < j) {
            // FIX 2: correct power of 10 calculation
            long pow = 1;
            int digits = multi(nums[j]);
            while (digits-- > 0) {
                pow *= 10;
            }

            // FIX 3: prevent int overflow
            long var = nums[i] * pow + nums[j];
            sum += var;

            i++;
            j--;
        }

        // FIX 4: handle middle element AFTER loop
        if (i == j) {
            sum += nums[i];
        }

        return sum;
    }
}