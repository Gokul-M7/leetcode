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
            sum+=mat[k][j];
            k++;
          }
       if(n%2==0)
       {
        return sum;
       }
       int l=n/2;
        return sum-mat[l][l];
    }
}