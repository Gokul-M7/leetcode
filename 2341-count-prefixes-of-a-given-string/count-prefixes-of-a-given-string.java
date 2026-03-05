class Solution {
    public int countPrefixes(String[] words, String s) {
       int count=0;
       int n=s.length();
       for(int i=0;i<words.length;i++)
       {
          String a=words[i];
          if(a.equals(s))
          {
            count++;
            continue;
          }  
          int k=a.length();
          int l=0;
          for(int j=0;j<k;j++)
          {
              if( j<n && a.charAt(j) == s.charAt(j))
              {
                 l++;
              }else
              {
                break;
              }
          } 
          if(l==k)
          {
            count++;
          }
       }
       return count;
    }
}