class Solution {
    public boolean search(int[] nums, int target) {
         boolean a=false;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==target)
            {
               a=true; 
            }
        }
        return a;
    }
}