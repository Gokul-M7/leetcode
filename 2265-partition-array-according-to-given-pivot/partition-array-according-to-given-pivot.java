class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
       List<Integer> before=new ArrayList<>();
       List<Integer> after=new ArrayList<>();
       int c=0;
       int n=nums.length;
       for(int i=0;i<n;i++)
       {
           if(nums[i]<pivot)
           {
               before.add(nums[i]);
           }else if(nums[i]==pivot)
           {
             c++;
           }else
           {
             after.add(nums[i]);
           }
       }
       int h=0;
       for(int i:before)
       {
        nums[h++]=i;
       }
       for(int i=0;i<c;i++)
       {
        nums[h++]=pivot;
       }
       for(int i:after)
       {
        nums[h++]=i;
       }
       return nums;
    }
}