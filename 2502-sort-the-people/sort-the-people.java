class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        int n=names.length;
        HashMap<Integer,Integer> ans=new HashMap<>();
        for(int i=0;i<n;i++)
        {
            ans.put(i,heights[i]);
        }
        List<Map.Entry<Integer,Integer>> list=new ArrayList<>(ans.entrySet());
        Collections.sort(list,(a,b) -> b.getValue() - a.getValue());
        int i=0;
        String[] value=new String[n];
        for(Map.Entry<Integer,Integer> eq : list)
        {
            value[i++]=names[eq.getKey()];
        }
        return value;
    }
}