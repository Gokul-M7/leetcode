class Solution {
    public int findComplement(int num) {
        String s=Integer.toBinaryString(num);
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i) == '0')
            {
                sb.append("1");
            }else
            {
                sb.append("0");
            }
        }
        String a=sb.toString();
        int v=0;
        for(int i=s.length()-1;i>=0;i--)
        {
            if(a.charAt(i) == '1')
            {
            v+=Math.pow(2,s.length()-i-1);
            }
        }
        return v;
    }
}