class Solution {
    public String findDifferentBinaryString(String[] nums) {
       int n=nums.length;
       List<String> ans = new ArrayList<>(Arrays.asList(nums));
       int c=1<<n;
       for(int i=0;i<c;i++)
       {
        String v=String.format("%" + n + "s", Integer.toBinaryString(i)).replace(' ', '0');
        if(!ans.contains(v))
        {
            return v;
        }
       }
       return "";
    }
}