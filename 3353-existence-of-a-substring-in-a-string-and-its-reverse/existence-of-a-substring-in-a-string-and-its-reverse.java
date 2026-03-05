class Solution {
    public boolean isSubstringPresent(String s) {
       int n=s.length();
       for(int i=0;i<n-1;i++)
       {
          String v="";
          v+=s.charAt(i+1);
          v+=s.charAt(i);
          if(s.contains(v))
          {
            return true;
          }
       }
       return false;
    }
}