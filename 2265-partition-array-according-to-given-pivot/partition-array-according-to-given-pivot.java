class Solution {
    public int[] pivotArray(int[] num, int p) {
       int n=num.length;
       int[] nums=new int[n];
       int h=0,c=0;
       for(int i:num)
       {
        if(i<p)
        {
        nums[h++]=i;
        }else if(i == p)
        {
            c++;
        }
       }
       for(int i=0;i<c;i++)
       {
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