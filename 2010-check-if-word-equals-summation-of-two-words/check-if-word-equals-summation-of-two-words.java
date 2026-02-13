class Solution {
    public boolean isSumEqual(String f, String s, String t) {
        int n1=f.length();
        int n2=s.length();
        int n3=t.length();
        int sum=0;
        String m="";
        for(int i=0;i<n1;i++)
        {
          m+=(f.charAt(i)-'a');
        }
        int n=Integer.valueOf(m);
        sum+=n;
        m="";
        for(int i=0;i<n2;i++)
        {
          m+=(s.charAt(i)-'a');
        }
         n=Integer.valueOf(m);
        sum+=n;
         m="";
        for(int i=0;i<n3;i++)
        {
          m+=(t.charAt(i)-'a');
        }
         n=Integer.valueOf(m);
         return sum==n;
    }
}