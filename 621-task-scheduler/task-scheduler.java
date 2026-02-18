class Solution {
    public int leastInterval(char[] tasks, int n) {
        int k=tasks.length;
        int[] freq=new int[26];
        int max=Integer.MIN_VALUE;
        int count=0;
        for(char c : tasks)
        {
            freq[c-'A']++;
            if( freq[c-'A'] > max)
            {
                max=freq[c-'A'];
                count=1;
            }else if(freq[c-'A']==max)
            {
                count++;
            }
        }
        int minnumbers = ((max-1)*(n+1))+count;
        if(k<minnumbers) return minnumbers;
        return k;  //(max freq-1)*(n+1)+x;   x=number of maximum;
    }
}