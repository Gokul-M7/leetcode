class Solution {
    private boolean vowel(char ch)
    {
        return "aeiouAEIOU".indexOf(ch)!=-1;
    }
    public boolean halvesAreAlike(String s) {
       int n=s.length();
       int c=0;
       for(int i=0;i<n/2;i++)
       {
        char ch=s.charAt(i);
        if(vowel(ch))
        {
            c++;
        }
       }
       for(int i=n-1;i>=n/2;i--)
       {
        char ch=s.charAt(i);
        if(vowel(ch))
        {
            c--;
        }
       }
       return c==0;
    }
}