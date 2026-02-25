class Solution {
    public int[] sortByBits(int[] arr) {
      int n=arr.length;
      Integer[] ans=new Integer[n];
      for(int i=0;i<n;i++)
      {
        ans[i]=arr[i];
      }
      Arrays.sort(ans,(a,b) -> {
            int bitA = Integer.bitCount(a);
            int bitB = Integer.bitCount(b);

            if (bitA == bitB) {
                return a - b;  
            }
            return bitA - bitB; 
        });
     for(int i=0;i<n;i++)
     {
        arr[i]=ans[i];
     }
     return arr;
    }
}