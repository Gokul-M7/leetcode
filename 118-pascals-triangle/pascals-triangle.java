class Solution {
    private static List<Integer> ncr(int r)
     {
    List<Integer> row = new ArrayList<>();
    int val = 1;
        for (int i = 0; i <= r; i++) {
        row.add(val);
        val = val * (r - i) / (i + 1);
    }
    return row;
     }
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>>  ans=new ArrayList<>();
        for(int i=0;i<numRows;i++)
        {
            ans.add(ncr(i));
        }
        return ans;
    }
}