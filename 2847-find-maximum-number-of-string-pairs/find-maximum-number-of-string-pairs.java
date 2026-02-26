class Solution {
    public int maximumNumberOfStringPairs(String[] words) {
      HashMap<String,Integer> ans=new HashMap<>();
      int n=words.length;
      int c=0;
      for(int i=0;i<n;i++)
      {
        if(ans.containsKey(words[i]))
        {
            c++;
        }else
        {
            StringBuilder sb=new StringBuilder();
            sb.append(words[i].charAt(1));
            sb.append(words[i].charAt(0));
            ans.putIfAbsent(sb.toString(),0);
        }
      }
       return c;
    }
}