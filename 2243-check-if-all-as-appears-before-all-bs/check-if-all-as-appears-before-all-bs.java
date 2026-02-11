class Solution {
    public boolean checkString(String s) {
     int count=0;
     int n=s.length();
     for(int i=0;i<n-1;i++)
     {
        if(s.charAt(i)=='b')
        {
            if(s.charAt(i) !=s.charAt(i+1))
            {
                return false;
            }
        }
     } 
      return true;
    }
}