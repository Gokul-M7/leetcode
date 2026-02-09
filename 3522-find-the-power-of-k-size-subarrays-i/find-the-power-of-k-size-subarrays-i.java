class Solution {
    private int result(int[] nums)
    {
        int n=nums.length;
        for(int i=0;i<n-1;i++)
        {
            if(nums[i+1] != nums[i]+1)
            {
                return -1;
            }
        }
        return nums[n-1];
    }
    public int[] resultsArray(int[] nums, int k) { 
     int n=nums.length;
     int[] value=new int[n-k+1];
     for(int i=0;i<=n-k;i++)
     {
        value[i]=result(Arrays.copyOfRange(nums,i,i+k));
     }
     return value;
    }
}