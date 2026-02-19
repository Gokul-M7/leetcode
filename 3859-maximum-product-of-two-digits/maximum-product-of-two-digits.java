class Solution {
    public int maxProduct(int n) {
      int max2=Integer.MIN_VALUE;
      int max1=Integer.MIN_VALUE;
      while(n>0)
      {
        int val = n%10;
        if (val > max1) {
         max2 = max1;
         max1 = val;
        } else if (val > max2) {
        max2 = val;
        }
         n/=10;
      }   
     return max1*max2;
    }
}