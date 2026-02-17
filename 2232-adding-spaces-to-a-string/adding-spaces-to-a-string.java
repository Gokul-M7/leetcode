class Solution {
    public String addSpaces(String s, int[] spaces) {
        int n=s.length();
        int m=spaces.length;
        StringBuilder sb=new StringBuilder();
        int i=0,j=0;
        while(i<n)
        {
            if(j<m)
            {
            if(i==spaces[j])
            {
                sb.append(" ");
                j++; 
            }
            }
            sb.append(s.charAt(i));
            i++;
        }
        return sb.toString();
    }
}