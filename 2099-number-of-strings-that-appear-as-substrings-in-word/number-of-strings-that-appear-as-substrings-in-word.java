class Solution {
    public int numOfStrings(String[] pa, String word) {
        int c=0;
        for(String i:pa)  
        {
             if(word.contains(i))
             {
                c++;
             }
        }
        return c;
    }
}