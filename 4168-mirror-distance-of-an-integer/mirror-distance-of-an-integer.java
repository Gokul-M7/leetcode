class Solution {
    public int mirrorDistance(int n) {
      int rev=0;
      int v=n;
      while(v>0)
      {
        int tem=v%10;
        rev=rev*10+tem;
        v/=10;
      }
      return Math.abs(n-rev);
    }
}