class Solution {
    public void nextPermutation(int[] nums) {
        int n=nums.length;
        int ind=-1;
        for(int i=n-2;i>=0;i--)
        {
            if(nums[i]<nums[i+1])
            {
             ind=i;
             break;
            }
              
        }
        if(ind==-1)
        {
            int s=0,h=n-1;
            while(s<=h)
            {
                int t=nums[s];
                nums[s]=nums[h];
                nums[h]=t;
                s++;
                h--;
            }
        } else
        {
        for(int i=n-1;i>=ind;i--)
        {
            if(nums[i]>nums[ind] )
             {  
                int t=nums[i];
                nums[i]=nums[ind];
                nums[ind]=t;
                break;
             }
        }
         int s = ind + 1, h = n - 1;
            while (s < h) {
                int t = nums[s];
                nums[s] = nums[h];
                nums[h] = t;
                s++;
                h--;
            }
        }
    }
}