class Solution {
    public int[] getSneakyNumbers(int[] nums) {
        int[] ans=new int[2];
        int n=nums.length;
        int c=0;
        for(int i=0;i<n-1;i++)
        {
            for(int j=i+1;j<n;j++)
            {
               if(nums[i]==nums[j]) 
               {
                ans[c++]=nums[i];
               }
            } 
        }
        return ans;
    }
}