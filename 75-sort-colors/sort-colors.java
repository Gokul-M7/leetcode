class Solution {
    public void sortColors(int[] nums) {
        int n=nums.length;
        int mid=0;
        int low=0;
        int high=n-1;
        while(mid<=high)
        {
            if(nums[mid]==0)
            {
                int t=nums[low];
                nums[low]=nums[mid];
                nums[mid]=t;
                mid++;
                low++;
            }else if(nums[mid]==1)
            {
                mid++;
            }else if(nums[mid]==2)
            {
                 int t=nums[mid];
                nums[mid]=nums[high];
                nums[high]=t;
                high--;
            }
        }
    }
}