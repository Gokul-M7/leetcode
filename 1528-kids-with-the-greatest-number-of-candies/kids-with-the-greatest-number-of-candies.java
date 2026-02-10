class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extra) {
      int n=candies.length;
      int max=candies[0];
      for(int i=1;i<n;i++)
      {
        max=Math.max(max,candies[i]);
      }  
      List<Boolean> ans=new ArrayList<>();
      for(int i=0;i<n;i++)
      {
        if((candies[i]+extra)>= max)
        {
            ans.add(true);
        }else
        {
            ans.add(false);
        }
      }
      return ans;
    }
}