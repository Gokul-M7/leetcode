class Solution {
    public boolean wordPattern(String p, String s) {
        String[] arr=s.split(" ");
        HashMap<Character,String> ans=new HashMap<>();
        int n=p.length();
        int m=arr.length;
        if(n!=m) return false;
        for(int i=0;i<n && i<m;i++)
        {
            char ch=p.charAt(i);
            if(ans.containsKey(ch))
            {
                if(!ans.get(ch).equals(arr[i]))
                {
                    return false;
                }
            }else
            {
                if(ans.containsValue(arr[i]))
                {
                return false;
                }
                else
                {
                ans.put(ch,arr[i]);
                }
            }
        }
        return true;
    }
}