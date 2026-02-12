class Solution {
    public int diagonalSum(int[][] mat) {
        int n=mat.length;
        if(n==1)
        {
            return mat[0][0];
        }
        int sum=0;
          for(int i=0;i<n;i++)
          {
            sum+=mat[i][i];
          }
          int k=0;
          for(int j=n-1;j>=0;j--)
          {
            if(k!=j)
            {
            sum+=mat[k][j];
            }
            k++;
          }
      
        return sum;
    }
}