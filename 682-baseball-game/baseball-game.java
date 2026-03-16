class Solution {
    public int calPoints(String[] op) {
        int sum=0;
        List<Integer> ans=new ArrayList<>();
        int n=op.length;
        int i=0;
        while(i<n)
        {
            int m=ans.size();
            if(op[i].equals("C") && m>0)
            {
                ans.remove(m-1);
            }else if(op[i].equals("D") && m>0)
            {
                ans.add(Integer.valueOf(ans.get(m - 1) * 2));
            }
            else if(op[i].equals("+") && m>1)
            {
                 ans.add( Integer.valueOf(ans.get(m-1))+ Integer.valueOf(ans.get(m-2)));
            }else
            {
                ans.add(Integer.valueOf(op[i]));
            }
            i++;
        }
        for(int a:ans)
        {
            sum+=a;
        }
        return sum;
    }
}