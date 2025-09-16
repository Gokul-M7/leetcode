class Solution {
    public int majorityElement(int[] nums) {
        int n=nums.length;
        int c=0;
        int a=0;
        for(int i=0;i<n;i++)
        {
            if(c==0)
            {
                c=1;
                a=nums[i];
            }else if( nums[i] == a)
            {
                c++;
            }else
            {
                c--;
            }
        }
        int c1=0;
        for(int i=0;i<n;i++)
        {
            if(nums[i]==a)
            {
             c1++;
            }
            if(c1>n/2)
            {
                return a;
            }
        }
        return -1;
    }
}