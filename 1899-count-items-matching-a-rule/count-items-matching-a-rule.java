class Solution {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int pos=-1;
        if(ruleKey.equals("type"))
        {
            pos=0;
        }else if(ruleKey.equals("color"))
        {
            pos=1;
        }else
        {
            pos=2;
        }
        int c=0;
        for(List<String> ans : items)
        {
            if(ans.get(pos).equals(ruleValue))
            {
                c++;
            }
        }
        return c;
    }
}