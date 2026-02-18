class Solution {
    public int leastInterval(char[] tasks, int n) {
        int k=tasks.length;
        HashMap<Integer,Integer> ans=new HashMap<>();
        for(int i:tasks)
        {
            ans.put(i,ans.getOrDefault(i,0)+1);
        }
        int max=Integer.MIN_VALUE;
        int count=0;
        for(int v:ans.values())
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