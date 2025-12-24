class Solution {
    public int minimumBoxes(int[] apple, int[] capacity) {
        int n=apple.length;
        int m=capacity.length;
        int s=0;
        for(int i=0;i<n;i++)
        {
           s+=apple[i];
        }
        Arrays.sort(capacity);
        int c=0;
        int st=0;
        for(int i=m-1;i>=0;i--)
        {
            if(s>st)
            {
                st+=capacity[i];
                c++;
                if(s<st)
                {
                    return c;
                }
            }
        }
        return c;
    }
}