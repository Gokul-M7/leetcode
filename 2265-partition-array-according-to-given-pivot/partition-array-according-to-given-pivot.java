class Solution {
    public int[] pivotArray(int[] num, int p) {
       int n=num.length;
       int[] nums=new int[n];
       int h=0;
       for(int i:num)
       {
        if(i<p)
        {
        nums[h++]=i;
        }
       }
       for(int i:num)
       {
        if(i==p)
        nums[h++]=p;
       }
       for(int i:num)
       {
        if(i>p)
        nums[h++]=i;
       }
       return nums;
    }
}