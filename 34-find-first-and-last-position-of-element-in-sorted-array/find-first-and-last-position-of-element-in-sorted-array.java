class Solution {
    public int[] searchRange(int[] nums, int target) {
        int n=nums.length;
        int ans[]=new int[2];
        int j=0;
        for(int i=0;i<n;i++)
        {
            if(nums[i]==target)
            {
               ans[j]=i;
               j++;
               break;
            }
        }
        for(int i=n-1;i>=0;i--)
        {
            if(nums[i]==target)
            {
               ans[j]=i;
               break;
            }
        }
        if(j==0 || n==0 )
        {
            ans[0]=-1;
            ans[1]=-1;
        }      
        return ans;
    }
}