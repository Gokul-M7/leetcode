class Solution {
    public int[] rearrangeArray(int[] nums) {
        int n=nums.length;
        int[] a=new int[n];
        int[] b=new int[n];
        int j=0,k=0;
        for(int i=0;i<n;i++)
        {
            if(nums[i]>0)
            {
                a[j++]=nums[i];
            }else
            {
                b[k++]=nums[i];
            }
        }
         int m=0;
        for(int i=0;i<n;i+=2)
        {

            nums[i]=a[m];
            nums[i+1]=b[m];
            m++;
        }
        return nums;       
    }
}