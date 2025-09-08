class Solution {
    private boolean not(int v)
    {
        while(v>0)
        {
        if(v%10==0)
          return false;
        v/=10;
        }
        return true;  
    }
    public int[] getNoZeroIntegers(int n) {
        for(int i=1;i<n;i++)
        {
           int j=n-i;
           if(not(i) && not(j))
            return new int[]{i,j};
            
        }
        return new int[]{};
    }
}