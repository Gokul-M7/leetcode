class Solution {
    public int sumOfUnique(int[] nums) {
        int n=nums.length;
        int sum=0;
        int[] arr=new int[101];
        for(int i=0;i<n;i++)
        {
            arr[nums[i]]++;
        }
        for(int i=0;i<=100;i++)
        {
            if(arr[i]==1)
            {
                sum+=i;
            }
        }  
        return sum;
    }
}