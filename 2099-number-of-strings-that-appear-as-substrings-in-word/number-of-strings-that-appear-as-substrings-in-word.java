class Solution {
    public int numOfStrings(String[] pa, String word) {
        int n=pa.length;
        int c=0;
        for(int i=0;i<n;i++)  
        {
             if(word.contains(pa[i]))
             {
                c++;
             }
        }
        return c;
    }
}