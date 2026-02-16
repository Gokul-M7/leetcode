class Solution {
    public boolean detectCapitalUse(String w) {
      int n=w.length();
      int u=0,l=0,sp=0;
      for(int i=0;i<n;i++)
      {
         char ch=w.charAt(i);
         if (Character.isUpperCase(ch)) {
          u++;
         }

        if (Character.isLowerCase(ch)) {
            l++;
          }
      }  
       if( Character.isUpperCase(w.charAt(0)))
      {
        sp++;
      }
        if( u==n || l==n || (sp+l)==n)
        {
            return true;
        }
        return false;
    }
}