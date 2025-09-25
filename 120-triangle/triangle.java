class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
        int row=triangle.size();
        int[] min=new int[row];
        for(int i=0;i<row;i++)
        {
            min[i]=triangle.get(row-1).get(i);
        }
        for(int i=row-2;i>=0;i--)
        {
            for(int c=0;c<=i;c++)
            {
                min[c]=Math.min(min[c] ,min[c+1]) + triangle.get(i).get(c);
            }
        }
        return min[0];
    }
}