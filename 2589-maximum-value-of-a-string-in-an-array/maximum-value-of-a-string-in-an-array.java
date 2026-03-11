class Solution {
    public int maximumValue(String[] strs) {
      int max=-1;
      for(String s:strs)
      {
        int c=0;
        char[] arr=s.toCharArray();
        for(int i=0;i<s.length();i++)
        {
            if(Character.isDigit(arr[i]))
            {
                c++;
            }
        }
        if(c==s.length())
        {
            max=Math.max(max,Integer.valueOf(s));
        }else
        {
            max=Math.max(max,s.length());
        }
      }
      return max;
    }
}