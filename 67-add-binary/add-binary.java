class Solution {
    public String addBinary(String a, String b) {
        int n = a.length();
        int m = b.length();

        StringBuilder sb = new StringBuilder();

        int i = n - 1;
        int j = m - 1;
        int carry = 0;  
        while (i >= 0 || j >= 0 || carry == 1) {
            int sum = carry;

            if (i >= 0) {
                sum += a.charAt(i) - '0';
                i--;
            }

            if (j >= 0) {
                sum += b.charAt(j) - '0';
                j--;
            }

            sb.append(sum % 2);
            carry = sum / 2;
        }

        sb.reverse();
        return sb.toString();
    }
}
