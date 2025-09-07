class Solution {
    public int[] sumZero(int n) {
        int[] a=new int[n];
        int in=0;
        for(int i=1;i<=n/2;++i)
        {
            a[in++]=i;
            a[in++]=-i;
        }
        if(n%2==1)
        {
            a[in]=0;
        }
        return a;
    }
}