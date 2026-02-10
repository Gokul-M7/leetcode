class Solution {
    public int maximumWealth(int[][] a) {
      int n=a.length;
      int m=a[0].length;
      int max=0;
      for(int i=0;i<n;i++)
      {
        int sum=0;
        for(int j=0;j<m;j++)
        {
            sum+=a[i][j];
        }
        max=Math.max(max,sum);
      }
      return max;
    }
}