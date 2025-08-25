class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int c=0,m=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==1)
            {
                c++;
                m=Math.max(m,c);
            }
            else
            {
                c=0;
            }  
        }

      return m;
    }
}