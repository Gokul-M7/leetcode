class Solution {
    public int missingNumber(int[] nums) {
        int a=0;
        int n=nums.length;
       for(int i=1;i<=n;i++)
        {
            a=a^i;
        }
        for(int i=0;i<n;i++)
        {
            a=a^nums[i];
        }
        return a;           
    }
}