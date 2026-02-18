class Solution {
    public int leastInterval(char[] tasks, int n) {
        int k=tasks.length;
        int[] freq=new int[26];
        for(char c : tasks)
        {
            freq[c-'A']++;
        }
        int max=Integer.MIN_VALUE;
        int count=0;
        for(int v:freq)
        {
            if(v>max)
            {
                max=v;
                count=1;
            }else if(v==max)
            {
                count++;
            }
        }
        int minnumbers = ((max-1)*(n+1))+count;
        if(k<minnumbers) return minnumbers;
        return k;  //(max freq-1)*(n+1)+x;   x=number of maximum;
    }
}