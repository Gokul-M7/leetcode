class Solution {
    public int countNegatives(int[][] g) {
        int n=g.length;
        int m=g[0].length;
        int c=0;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                if(g[i][j]<0)
                {
                    c++;
                }
            }
        }
        
        return c;
    }
}