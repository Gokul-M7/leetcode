class Solution {
    public int[] shuffle(int[] nums, int n) {
      int k=nums.length;
      int[] arr=new int[k];
      int j=n,l=0,i=0;
      while(j<k)
      {
        arr[i++]=nums[l++];
        arr[i++]=nums[j++];
      }
      return arr;
    }
}