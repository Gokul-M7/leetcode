class Solution {
    public int maxFrequencyElements(int[] nums) {
        int n=nums.length;
      int[] freq=new int[101];
      int maxfreq=0;
      for(int num:nums)
      {
        freq[num]++;
        maxfreq=Math.max(maxfreq,freq[num]);
      }
      int ans=0;
      for(int i=1;i<101;i++)
      {
        if(freq[i]==maxfreq)
          ans+=maxfreq;
      }
      return ans;
    }
}