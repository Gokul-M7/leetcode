class Solution {

    private static boolean isvowel(char ch)
    {
        return "aeiouAEIOU".indexOf(ch)!=-1;
    }
    public String trimTrailingVowels(String s) {
      int c=0;
      int n=s.length();
      for(int i=n-1;i>=0;i--)
      {
        char ch=s.charAt(i);
        if(isvowel(ch))
        {
            c++;
        }else
        {
            break;
        }
      }
      if(c==n)
      {
        return "";
      }
      return s.substring(0,n-c);
    }
}